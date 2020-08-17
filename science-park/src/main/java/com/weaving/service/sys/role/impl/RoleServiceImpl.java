package com.weaving.service.sys.role.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.weaving.common.utils.Utils;
import com.weaving.dao.sys.role.RoleDao;
import com.weaving.entry.sys.menu.MenuTree;
import com.weaving.entry.sys.role.Role;
import com.weaving.entry.sys.role.RoleUserMenuParam;
import com.weaving.entry.sys.role.RoleUserResult;
import com.weaving.entry.sys.role.SysRoleMenu;
import com.weaving.entry.sys.role.SysRoleUser;
import com.weaving.entry.sys.user.User;
import com.weaving.service.sys.menu.MenuServie;
import com.weaving.service.sys.role.RoleService;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;

	@Autowired
	private MenuServie menuService;

	@Override
	public void addRole(Role role) throws Exception{
		role.setId(Utils.getNumUUID());
		role.setCreateDate(new Date());
		roleDao.addRole(role);
	}

	@Override
	public List<Role> getAllRole(Role role) throws Exception{
		return roleDao.getAllRole();
	}

	@Override
	public void userBindRole(RoleUserMenuParam param) throws Exception{
		if (null != param.getUserIds()) {
			for (String userId : param.getUserIds()) {
				SysRoleUser roleUser = new SysRoleUser();
				roleUser.setId(Utils.getNumUUID());
				roleUser.setRoleId(param.getRoleId());
				roleUser.setUserId(userId);
				roleUser.setCreateDate(new Date());
				roleDao.userBindRole(roleUser);
			}
		}
	}

	@Override
	public void cancleBindUser(RoleUserMenuParam param) throws Exception{
		if (null != param.getUserIds()) {
			for (String userId : param.getUserIds()) {
				SysRoleUser roleUser = new SysRoleUser();
				roleUser.setRoleId(param.getRoleId());
				roleUser.setUserId(userId);
				roleDao.cancleBindUser(roleUser);
			}
		}
	}

	@Override
	public List<RoleUserResult> getUserListByRole(String roleId, String realname) throws Exception{
		return roleDao.getUserListByRole(roleId, realname);
	}

	@Override
	public List<MenuTree> getMenuTreeByRole(String roleId) throws Exception{

		List<MenuTree> menuRole = menuService.menuTreeByRole(roleId);

		return menuRole;
	}

	@Override
	public List<MenuTree> getMenuTreeByRoleId(String roleId) throws Exception{
		return menuService.menuTreeByRoleId(roleId);
	}

	@Override
	public void menuBindRole(RoleUserMenuParam roleMenu) throws Exception{
		if (null != roleMenu.getMenuIds()) {
			for (String menuId : roleMenu.getMenuIds()) {
				SysRoleMenu roleMenus = new SysRoleMenu();
				roleMenus.setId(Utils.getNumUUID());
				roleMenus.setRoleId(roleMenu.getRoleId());
				roleMenus.setMenuId(menuId);
				roleDao.meunBindRole(roleMenus);

			}
		}
	}

	@Override
	public void cancleBindMenu(RoleUserMenuParam param) throws Exception{
		if (null != param.getMenuIds()) {
			for (String menuId : param.getMenuIds()) {
				SysRoleMenu roleMenus = new SysRoleMenu();
				roleMenus.setRoleId(roleMenus.getRoleId());
				roleMenus.setMenuId(menuId);
				roleDao.cancleBindMenu(roleMenus);
			}
		}
	}

	@Override
	public Role getRoleByUserId(String userId) throws Exception{
		Role role = roleDao.getRoleByUserId(userId);
		return role;
	}

	@Override
	public List<User> getOperation(String roleCode) throws Exception{
		List<User> list = roleDao.getOperation(roleCode);

		return list;
	}

}
