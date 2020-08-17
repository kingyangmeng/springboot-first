package com.weaving.entry.business.platform.device;

import com.weaving.entry.sys.comm.Comm;

/**
 * 设备管理
 * 
 * @author yang
 *
 */
public class Device extends Comm {

	private String id;
	private String province;// 省
	private String city;// 市
	private String district;// 区
	private String address;
	private String parkId;
	private String parkName;// 停车场名称
	private String deviceType;// 设备类型 1.闸机，2.摄像头，3.信息屏，4.网络设备
	private String deviceName;// 设备名称
	private String deviceIP;// 设备ip
	private String deviceCode;// 设备编码
	private String deviceStatus;// 设备状态 1：正常，2：离线，3：故障

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceIP() {
		return deviceIP;
	}

	public void setDeviceIP(String deviceIP) {
		this.deviceIP = deviceIP;
	}

	public String getDeviceCode() {
		return deviceCode;
	}

	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}

	public String getDeviceStatus() {
		return deviceStatus;
	}

	public void setDeviceStatus(String deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

	@Override
	public String toString() {
		return "Device [id=" + id + ", province=" + province + ", city=" + city + ", district=" + district
				+ ", address=" + address + ", parkId=" + parkId + ", parkName=" + parkName + ", deviceType="
				+ deviceType + ", deviceName=" + deviceName + ", deviceIP=" + deviceIP + ", deviceCode=" + deviceCode
				+ ", deviceStatus=" + deviceStatus + "]";
	}

}
