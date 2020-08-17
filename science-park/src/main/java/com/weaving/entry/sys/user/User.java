package com.weaving.entry.sys.user;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * 权限用户
 * 
 * @author yang
 *
 */
public class User {

	private String id;
	@NotBlank(message = "用户名不能为空")
	@NotNull(message = "用户名不能为空")
	private String username;
	private String realname;
	private String photo;
	private String sex;// 0 男 1 女
	private String phone;
	private String password;
	private String userStatus = "0";// 用户状态 0 可用，1 禁用,2,删除
	private String deptId;// 所属部门
	private String roleId;// 角色id
	private String parkId;// 所属停车场表id

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getParkId() {
		return parkId;
	}

	public void setParkId(String parkId) {
		this.parkId = parkId;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", realname=" + realname + ", photo=" + photo + ", sex="
				+ sex + ", phone=" + phone + ", password=" + password + ", userStatus=" + userStatus + ", deptId="
				+ deptId + ", roleId=" + roleId + ", parkId=" + parkId + "]";
	}

}
