package com.weaving.thirdparty.ketuo.entry.param;

/**
 * 车场终端设备
 * 
 * @author yang
 *
 */
public class DeviceParam extends BaseEntry {

	private int deviceType; // 默认值为0；

	public int getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(int deviceType) {
		this.deviceType = deviceType;
	}

	@Override
	public String toString() {
		return "DeviceParam [deviceType=" + deviceType + "]";
	}

}
