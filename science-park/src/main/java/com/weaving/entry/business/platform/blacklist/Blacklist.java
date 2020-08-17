package com.weaving.entry.business.platform.blacklist;

import com.weaving.entry.sys.comm.Comm;

/**
 * 黑名单
 * 
 * @author yang
 *
 */
public class Blacklist extends Comm {

	private String id;
	private String plateNumber; // 车牌号码
	private String cause;// 原因
	private String parkId;//车场id

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public String getParkId() {
		return parkId;
	}

	public void setParkId(String parkId) {
		this.parkId = parkId;
	}

	@Override
	public String toString() {
		return "Blacklist [id=" + id + ", plateNumber=" + plateNumber + ", cause=" + cause + ", parkId=" + parkId + "]";
	}

}
