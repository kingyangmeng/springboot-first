package com.weaving.thirdparty.ketuo.entry.result;

import java.util.List;

/**
 * 2.6.10区域剩余车位查询
 * @author Administrator
 *
 */
public class AreaFreeSpaceNumList {
	private Integer parkId;//车场id
	private Integer parkName;//车场名称
	private Integer totalNum;//总车位数
	private Integer freeSpaceNum;//空闲车位数
	private List<AreaFreeSpaceNum> areaInfo;//区域列表

	public Integer getParkId() {
		return parkId;
	}

	public void setParkId(Integer parkId) {
		this.parkId = parkId;
	}

	public Integer getParkName() {
		return parkName;
	}

	public void setParkName(Integer parkName) {
		this.parkName = parkName;
	}

	public Integer getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Integer getFreeSpaceNum() {
		return freeSpaceNum;
	}

	public void setFreeSpaceNum(Integer freeSpaceNum) {
		this.freeSpaceNum = freeSpaceNum;
	}

	public List<AreaFreeSpaceNum> getAreaInfo() {
		return areaInfo;
	}

	public void setAreaInfo(List<AreaFreeSpaceNum> areaInfo) {
		this.areaInfo = areaInfo;
	}

	@Override
	public String toString() {
		return "AreaFreeSpaceNumList [parkId=" + parkId + ", parkName=" + parkName + ", totalNum=" + totalNum
				+ ", freeSpaceNum=" + freeSpaceNum + ", areaInfo=" + areaInfo + "]";
	}
}
