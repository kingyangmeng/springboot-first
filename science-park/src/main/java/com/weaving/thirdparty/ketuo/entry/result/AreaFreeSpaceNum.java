package com.weaving.thirdparty.ketuo.entry.result;

/**
 * 2.6.10区域剩余车位查询
 * @author Administrator
 *
 */
public class AreaFreeSpaceNum {
	private Integer areaCode;//区域编号
	private String areaName;//区域名称
	private Integer placeCount;//区域停车位数
	private Integer freeSpaceNum;//区域剩余停车位数

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

	public Integer getFreeSpaceNum() {
		return freeSpaceNum;
	}

	public void setFreeSpaceNum(Integer freeSpaceNum) {
		this.freeSpaceNum = freeSpaceNum;
	}

	@Override
	public String toString() {
		return "AreaFreeSpaceNum [areaCode=" + areaCode + ", areaName=" + areaName + ", placeCount=" + placeCount
				+ ", freeSpaceNum=" + freeSpaceNum + "]";
	}
}
