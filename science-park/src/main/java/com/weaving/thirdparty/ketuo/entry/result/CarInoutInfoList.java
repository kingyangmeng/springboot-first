package com.weaving.thirdparty.ketuo.entry.result;

import java.util.List;

/**
 * 2.3.1查询进出记录
 * @author Administrator
 *
 */
public class CarInoutInfoList {
	private Integer pageIndex;
	private Integer pageSize;
	private Integer totalCount;
	private List<CarInoutInfo> detailList;//车场列表

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

	public List<CarInoutInfo> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<CarInoutInfo> detailList) {
		this.detailList = detailList;
	}

	@Override
	public String toString() {
		return "CarInoutInfoList [pageIndex=" + pageIndex + ", pageSize=" + pageSize + ", totalCount=" + totalCount
				+ ", detailList=" + detailList + "]";
	}
}
