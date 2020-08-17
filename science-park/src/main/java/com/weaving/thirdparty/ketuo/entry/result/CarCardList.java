package com.weaving.thirdparty.ketuo.entry.result;

import java.util.List;

/**
 * 2.7获取固定车列表
 * @author Administrator
 *
 */
public class CarCardList {
	private Integer pageIndex;
	private Integer pageSize;
	private Integer totalCount;
	private List<CarCardInfoList> carCardList;//车场列表
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

	public List<CarCardInfoList> getCarCardList() {
		return carCardList;
	}

	public void setCarCardList(List<CarCardInfoList> carCardList) {
		this.carCardList = carCardList;
	}

	@Override
	public String toString() {
		return "CarCardList [pageIndex=" + pageIndex + ", pageSize=" + pageSize + ", totalCount=" + totalCount
				+ ", carCardList=" + carCardList + "]";
	}
}
