package com.weaving.thirdparty.ketuo.entry.result;

import java.util.List;

/**
 * 2.1.4区域信息
 * @author Administrator
 *
 */
public class ParkingPlaceAreaList {
	private String parkArea;//停车场区域数
	private Integer totalPlaceCount;//停车场总停车位
	private List<ParkingPlaceArea> areaInfo;//区域信息

	public String getParkArea() {
		return parkArea;
	}

	public void setParkArea(String parkArea) {
		this.parkArea = parkArea;
	}

	public Integer getTotalPlaceCount() {
		return totalPlaceCount;
	}

	public void setTotalPlaceCount(Integer totalPlaceCount) {
		this.totalPlaceCount = totalPlaceCount;
	}

	public List<ParkingPlaceArea> getAreaInfo() {
		return areaInfo;
	}

	public void setAreaInfo(List<ParkingPlaceArea> areaInfo) {
		this.areaInfo = areaInfo;
	}

	@Override
	public String toString() {
		return "ParkingPlaceAreaList [parkArea=" + parkArea + ", totalPlaceCount=" + totalPlaceCount + ", areaInfo="
				+ areaInfo + "]";
	}
}
