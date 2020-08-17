package com.weaving.entry.sys.dept;

/**
 * 部门添加用户
 * 
 * @author yang
 *
 */
public class SysDeptUser {

	
	private String id;
	private String deptId;
	private String userId;
	
	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getDeptId() {
		return deptId;
	}




	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}




	public String getUserId() {
		return userId;
	}




	public void setUserId(String userId) {
		this.userId = userId;
	}




	@Override
	public String toString() {
		return "SysDeptUser [id=" + id + ", deptId=" + deptId + ", userId=" + userId + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
