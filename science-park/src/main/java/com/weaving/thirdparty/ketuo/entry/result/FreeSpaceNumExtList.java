package com.weaving.thirdparty.ketuo.entry.result;

import java.util.List;

/**
 * 2.6.5剩余车位查询扩展接口
 * @author Administrator
 *
 */
public class FreeSpaceNumExtList {
	private Integer parkId;//车场id
	private String parkName;//车场名称
	private Integer totalNum;//总车位数
	private Integer freeSpaceNum;//空闲车位数
	private List<FreeSpaceNumExt> carOccupiedInfo;//车场内各类车所占数量

	public Integer getParkId() {
		return parkId;
	}

	public void setParkId(Integer parkId) {
		this.parkId = parkId;
	}

	public String getParkName() {
		return parkName;
	}

	public void setParkName(String parkName) {
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

	public List<FreeSpaceNumExt> getCarOccupiedInfo() {
		return carOccupiedInfo;
	}

	public void setCarOccupiedInfo(List<FreeSpaceNumExt> carOccupiedInfo) {
		this.carOccupiedInfo = carOccupiedInfo;
	}

	@Override
	public String toString() {
		return "FreeSpaceNumExtList [parkId=" + parkId + ", parkName=" + parkName + ", totalNum=" + totalNum
				+ ", freeSpaceNum=" + freeSpaceNum + ", carOccupiedInfo=" + carOccupiedInfo + "]";
	}
}
