package com.weaving.service.sys.role;

import java.util.List;

import com.weaving.entry.sys.menu.MenuTree;
import com.weaving.entry.sys.role.Role;
import com.weaving.entry.sys.role.RoleUserMenuParam;
import com.weaving.entry.sys.role.RoleUserResult;
import com.weaving.entry.sys.user.User;

public interface RoleService {

	void addRole(Role role)throws Exception;

	List<Role> getAllRole(Role role)throws Exception;

	void userBindRole(RoleUserMenuParam param)throws Exception;

	List<RoleUserResult> getUserListByRole(String roleId, String realname)throws Exception;

	void cancleBindUser(RoleUserMenuParam param)throws Exception;

	List<MenuTree> getMenuTreeByRole(String roleId)throws Exception;

	/**
	 * 只查询出角色有的菜单
	 * 
	 * @param roleId
	 * @return
	 */
	List<MenuTree> getMenuTreeByRoleId(String roleId)throws Exception;

	void menuBindRole(RoleUserMenuParam roleMenu)throws Exception;

	void cancleBindMenu(RoleUserMenuParam param)throws Exception;

	Role getRoleByUserId(String id)throws Exception;

	/**
	 * 根据角色码查询所有此角色的用户
	 * 
	 * @param roleCode
	 * @return
	 */
	List<User> getOperation(String roleCode)throws Exception;

}
