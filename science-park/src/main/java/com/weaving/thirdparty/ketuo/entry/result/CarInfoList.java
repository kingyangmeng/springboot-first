package com.weaving.thirdparty.ketuo.entry.result;

import java.util.List;

/**
 * 2.6.1在场车辆查询
 * @author Administrator
 *
 */
public class CarInfoList {
	private Integer pageIndex;
	private Integer pageSize;
	private Integer totalCount;
	private List<CarInfo> plateList;//车辆列表

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

	public List<CarInfo> getPlateList() {
		return plateList;
	}

	public void setPlateList(List<CarInfo> plateList) {
		this.plateList = plateList;
	}

	@Override
	public String toString() {
		return "CarInfoList [pageIndex=" + pageIndex + ", pageSize=" + pageSize + ", totalCount=" + totalCount
				+ ", plateList=" + plateList + "]";
	}
}
