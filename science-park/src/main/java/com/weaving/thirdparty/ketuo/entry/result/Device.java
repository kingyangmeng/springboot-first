package com.weaving.thirdparty.ketuo.entry.result;

/**
 * 2.1.3车场终端设备信息
 * @author Administrator
 *
 */
public class Device {
	private String deviceCode;//设备编码
	private String deviceIp;//设备Ip
	private String deviceName;//设备名称
	private Integer deviceType;//设备类型

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

	@Override
	public String toString() {
		return "Device [deviceCode=" + deviceCode + ", deviceIp=" + deviceIp + ", deviceName=" + deviceName
				+ ", deviceType=" + deviceType + "]";
	}
}
