package com.weaving.thirdparty.ketuo.entry.result;

import java.util.List;

/**
 * 2.1.1停车场信息
 * 
 * @author yang
 *
 */
public class ParkingLotList {
	private Integer pageIndex;
	private Integer pageSize;
	private Integer totalCount;
	private List<ParkingLot> parkingList;

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ParkingLot> getParkingList() {
		return parkingList;
	}

	public void setParkingList(List<ParkingLot> parkingList) {
		this.parkingList = parkingList;
	}

	@Override
	public String toString() {
		return "ParkingLotList [pageIndex=" + pageIndex + ", pageSize=" + pageSize + ", totalCount=" + totalCount
				+ ", parkingList=" + parkingList + "]";
	}

}
