package com.weaving.entry.business.platform.log.run;

import com.weaving.entry.sys.comm.Comm;

/**
 * 系统运行日志
 * @author yang
 *
 */
public class Run extends Comm {
	private String id;//
	private String event;// 事件
	private String eventType;// 事件类型 1.设备故障，2.黑名单拦截，3.设备启停
	private String parkId;// 停车场Id
	private String parkName;// 停车场名称
	private String deviceId;// 设备id

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
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

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	@Override
	public String toString() {
		return "Operate [id=" + id + ", event=" + event + ", eventType=" + eventType + ", parkId=" + parkId
				+ ", parkName=" + parkName + ", deviceId=" + deviceId + "]";
	}
}
