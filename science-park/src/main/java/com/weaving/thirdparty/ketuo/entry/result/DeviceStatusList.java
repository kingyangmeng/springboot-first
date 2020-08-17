package com.weaving.thirdparty.ketuo.entry.result;

import java.util.List;

/**
 * 2.6.3设备状态查询
 * @author Administrator
 *
 */
public class DeviceStatusList {
	private List<DeviceDetails> deviceList;//设备列表

	public List<DeviceDetails> getDeviceList() {
		return deviceList;
	}

	public void setDeviceList(List<DeviceDetails> deviceList) {
		this.deviceList = deviceList;
	}

	@Override
	public String toString() {
		return "DeviceStatusList [deviceList=" + deviceList + "]";
	}
}
