package com.weaving.entry.sys.role;

import java.util.List;

/**
 * 用户 角色绑定
 * 
 * @author yang
 *
 */
public class RoleUserMenuParam {

	private List<String> userIds;

	private List<String> menuIds;

	private String roleId;

	public List<String> getUserIds() {
		return userIds;
	}

	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public List<String> getMenuIds() {
		return menuIds;
	}

	public void setMenuIds(List<String> menuIds) {
		this.menuIds = menuIds;
	}

}
