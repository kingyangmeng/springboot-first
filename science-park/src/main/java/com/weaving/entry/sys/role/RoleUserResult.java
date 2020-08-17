package com.weaving.entry.sys.role;

/**
 * 根据角色id返回的用户信息
 * 
 * @author yang
 *
 */
public class RoleUserResult {

	private String userId;
	private String username;
	private String realname;
	private String roleId;

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	@Override
	public String toString() {
		return "RoleUserResult [roleId=" + roleId + ", userId=" + userId + ", username=" + username + ", realname="
				+ realname + "]";
	}

}
