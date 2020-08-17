package com.weaving.thirdparty.ketuo.entry.result;

/**
 * 2.6.3设备状态查询
 * @author Administrator
 *
 */
public class DeviceDetails {
	private String deviceCode;//设备编码
	private String deviceIp;//设备Ip
	private String deviceName;//设备名称
	private Integer deviceType;//设备类型 ，详见参数枚举 1.6.6
	private String deviceStatus;//设备状态 ，详见参数枚举1.6.9
	private String deviceTime;//状态变更时间 

	public String getDeviceCode() {
		return deviceCode;
	}

	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}

	public String getDeviceIp() {
		return deviceIp;
	}

	public void setDeviceIp(String deviceIp) {
		this.deviceIp = deviceIp;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public Integer getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(Integer deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceStatus() {
		return deviceStatus;
	}

	public void setDeviceStatus(String deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

	public String getDeviceTime() {
		return deviceTime;
	}

	public void setDeviceTime(String deviceTime) {
		this.deviceTime = deviceTime;
	}

	@Override
	public String toString() {
		return "DeviceDetails [deviceCode=" + deviceCode + ", deviceIp=" + deviceIp + ", deviceName=" + deviceName
				+ ", deviceType=" + deviceType + ", deviceStatus=" + deviceStatus + ", deviceTime=" + deviceTime + "]";
	}
}
