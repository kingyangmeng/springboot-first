package com.weaving.thirdparty.ketuo.entry.result;

import java.util.List;

/**
 * 2.1.3车场终端设备信息
 * @author Administrator
 *
 */
public class DeviceList {
	private List<DeviceKetuo> deviceList; //设备列表

	public List<DeviceKetuo> getDeviceList() {
		return deviceList;
	}

	public void setDeviceList(List<DeviceKetuo> deviceList) {
		this.deviceList = deviceList;
	}

	@Override
	public String toString() {
		return "DeviceList [deviceList=" + deviceList + "]";
	}
}
