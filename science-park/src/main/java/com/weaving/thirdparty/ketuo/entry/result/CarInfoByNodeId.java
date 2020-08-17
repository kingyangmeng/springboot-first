package com.weaving.thirdparty.ketuo.entry.result;

/**
 * 2.6.4根据通道获取当前车辆
 * @author Administrator
 *
 */
public class CarInfoByNodeId {
	private String carPlateNum;//车牌号 
	private String capTime;//抓拍时间
	
	public String getCarPlateNum() {
		return carPlateNum;
	}
	
	public void setCarPlateNum(String carPlateNum) {
		this.carPlateNum = carPlateNum;
	}
	
	public String getCapTime() {
		return capTime;
	}
	
	public void setCapTime(String capTime) {
		this.capTime = capTime;
	}
	
	@Override
	public String toString() {
		return "CarInfoByNodeId [carPlateNum=" + carPlateNum + ", capTime=" + capTime + "]";
	}
}
