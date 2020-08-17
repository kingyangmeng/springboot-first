package com.weaving.entry.business.platform.log.operate;

import com.weaving.entry.sys.comm.Comm;

/**
 * 用户操作日志
 * 
 * @author yang
 *
 */
public class Operate extends Comm {
	private String id;//
	private String parkName;// 停车场名称
	private String opearteType;// 事件类型 1.设备故障，2.黑名单拦截，3.设备启停
	private String parkId;// 停车场Id
	private String userId;// 用户id
	private String roleName;// 用户角色
	private String realname;// 用户姓名
	private String phone;// 用户手机号码

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParkName() {
		return parkName;
	}

	public void setParkName(String parkName) {
		this.parkName = parkName;
	}

	public String getOpearteType() {
		return opearteType;
	}

	public void setOpearteType(String opearteType) {
		this.opearteType = opearteType;
	}

	public String getParkId() {
		return parkId;
	}

	public void setParkId(String parkId) {
		this.parkId = parkId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Operate [id=" + id + ", parkName=" + parkName + ", opearteType=" + opearteType + ", parkId=" + parkId
				+ ", userId=" + userId + ", roleName=" + roleName + ", realname=" + realname + ", phone=" + phone + "]";
	}

}
