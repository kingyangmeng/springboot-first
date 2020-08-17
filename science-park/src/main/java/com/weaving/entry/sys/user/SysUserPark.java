package com.weaving.entry.sys.user;

public class SysUserPark {

	private String id;
	private String userId;
	private String parkId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getParkId() {
		return parkId;
	}

	public void setParkId(String parkId) {
		this.parkId = parkId;
	}

	@Override
	public String toString() {
		return "SysUserPark [id=" + id + ", userId=" + userId + ", parkId=" + parkId + "]";
	}

}
