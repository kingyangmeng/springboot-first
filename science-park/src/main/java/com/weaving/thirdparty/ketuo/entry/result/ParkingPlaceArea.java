package com.weaving.thirdparty.ketuo.entry.result;

public class ParkingPlaceArea {
	private Integer areaCode;//区域编号
	private String areaName;//区域名称
	private Integer placeCount;//区域停车位数

	public Integer getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(Integer areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Integer getPlaceCount() {
		return placeCount;
	}

	public void setPlaceCount(Integer placeCount) {
		this.placeCount = placeCount;
	}

	@Override
	public String toString() {
		return "ParkingPlaceArea [areaCode=" + areaCode + ", areaName=" + areaName + ", placeCount=" + placeCount + "]";
	}
}
