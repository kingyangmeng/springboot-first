package com.weaving.thirdparty.ketuo.entry.result;

import java.util.List;

/**
 * 2.3.2查询缴费记录
 * @author Administrator
 *
 */
public class ParkingPaymentList {
	private Integer  pageIndex;
	private Integer  pageSize;
	private Integer  totalCount;
	private List<ParkingPayment>  plateList;//车场列表

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

	public List<ParkingPayment> getPlateList() {
		return plateList;
	}

	public void setPlateList(List<ParkingPayment> plateList) {
		this.plateList = plateList;
	}

	@Override
	public String toString() {
		return "ParkingPaymentList [pageIndex=" + pageIndex + ", pageSize=" + pageSize + ", totalCount=" + totalCount
				+ ", plateList=" + plateList + "]";
	}
}
