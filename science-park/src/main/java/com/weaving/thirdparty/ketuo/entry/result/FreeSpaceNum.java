package com.weaving.thirdparty.ketuo.entry.result;

/**
 * 2.6.2剩余车位查询
 * @author Administrator
 *
 */
public class FreeSpaceNum {
	private Integer parkId;//车场id
	private String parkName;//车场名字
	private Integer totalNum;//总车位数
	private Integer parfreeSpaceNumkId;//空闲车位数

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

	public Integer getParfreeSpaceNumkId() {
		return parfreeSpaceNumkId;
	}

	public void setParfreeSpaceNumkId(Integer parfreeSpaceNumkId) {
		this.parfreeSpaceNumkId = parfreeSpaceNumkId;
	}

	@Override
	public String toString() {
		return "FreeSpaceNum [parkId=" + parkId + ", parkName=" + parkName + ", totalNum=" + totalNum
				+ ", parfreeSpaceNumkId=" + parfreeSpaceNumkId + "]";
	}
}
