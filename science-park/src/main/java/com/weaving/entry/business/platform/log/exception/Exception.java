package com.weaving.entry.business.platform.log.exception;

import com.weaving.entry.sys.comm.Comm;

/**
 * 系统异常日志
 * 
 * @author yang
 *
 */
public class Exception extends Comm{

	private String id;//
	private String exceptionEvent;// 异常事件
	private String exceptionType;// 异常类型 1.设备故障，2.抬杆异常，3.通讯故障
	private String parkId;// 停车场Id
	private String parkName;// 停车场名称
	private String remark;// 异常描述

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getExceptionEvent() {
		return exceptionEvent;
	}

	public void setExceptionEvent(String exceptionEvent) {
		this.exceptionEvent = exceptionEvent;
	}

	public String getExceptionType() {
		return exceptionType;
	}

	public void setExceptionType(String exceptionType) {
		this.exceptionType = exceptionType;
	}

	public String getParkId() {
		return parkId;
	}

	public void setParkId(String parkId) {
		this.parkId = parkId;
	}

	public String getParkName() {
		return parkName;
	}

	public void setParkName(String parkName) {
		this.parkName = parkName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Exception [id=" + id + ", exceptionEvent=" + exceptionEvent + ", exceptionType=" + exceptionType
				+ ", parkId=" + parkId + ", parkName=" + parkName + ", remark=" + remark + "]";
	}

}
