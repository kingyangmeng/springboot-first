package com.weaving.service.sys.user.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import com.weaving.common.Contants;
import com.weaving.common.RedisUtils;
import com.weaving.common.utils.Utils;
import com.weaving.dao.sys.dept.DeptDao;
import com.weaving.dao.sys.role.RoleDao;
import com.weaving.dao.sys.user.UserDao;
import com.weaving.entry.sys.dept.SysDeptUser;
import com.weaving.entry.sys.menu.MenuTree;
import com.weaving.entry.sys.role.Role;
import com.weaving.entry.sys.role.SysRoleUser;
import com.weaving.entry.sys.user.User;
import com.weaving.service.sys.role.RoleService;
import com.weaving.service.sys.user.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private RedisUtils redisUtils;

	@Autowired
	private UserDao userDao;

	@Autowired
	private DeptDao deptDao;

	@Autowired
	private RoleDao roleDao;

	@Autowired
	private RoleService roleService;

	@Override
	public void addUser(String token, User user)throws Exception{
		String userId = Utils.getNumUUID();
		user.setId(userId);
		String username = user.getUsername();
		String password = user.getPassword();
		String md5Str = Contants.PASSWORD_STR + password + username;
		String Md5Password = DigestUtils.md5DigestAsHex(md5Str.getBytes());
		user.setPassword(Md5Password);
		// 保存用户
		userDao.addUser(user);
		// 保存用户部门
		User loginUser = (User) redisUtils.get(token);
		SysDeptUser deptUser = new SysDeptUser();
		deptUser.setId(Utils.getNumUUID());
		deptUser.setDeptId(loginUser.getDeptId());
		deptUser.setUserId(userId);
		deptDao.deptBindUser(deptUser);
		// 保存用户角色
		SysRoleUser roleUser = new SysRoleUser();
		roleUser.setId(Utils.getNumUUID());
		roleUser.setUserId(userId);
		roleUser.setRoleId(user.getRoleId());
		roleDao.userBindRole(roleUser);

	}

	@Override
	public void updateUser(User user) throws Exception{
		userDao.updateUser(user);
		// 保存用户角色
		if (StringUtils.isNotBlank(user.getRoleId())) {
			// 删除用户绑定的旧的角色
			roleDao.deleteRoleUser(user.getId());
			// 绑定新的角色
			SysRoleUser roleUser = new SysRoleUser();
			roleUser.setId(Utils.getNumUUID());
			roleUser.setUserId(user.getId());
			roleUser.setRoleId(user.getRoleId());
			roleDao.userBindRole(roleUser);
		}
	}

	@Override
	public void deleteUser(String id) throws Exception{
		userDao.deleteUser(id);
	}
	
	@Override
	public void forbidden(String id,String userStatus) throws Exception{
		userDao.forbidden(id,userStatus);
	}

	@Override
	public List<User> getUserList() throws Exception{
		return userDao.getUserList();
	}

	@Override
	public List<MenuTree> getMenuTree(String token) throws Exception{
		User user = (User) redisUtils.get(token);
		if (null != user) {
			Role role = roleService.getRoleByUserId(user.getId());
			if (null != role) {
				List<MenuTree> menuTree = roleService.getMenuTreeByRoleId(role.getId());
				return menuTree;
			}
			return null;
		} else {
			return null;
		}
	}

	

}
