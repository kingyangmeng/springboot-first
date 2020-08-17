package com.weaving.thirdparty.ketuo.entry.result;

import java.util.List;

/**
 * 2.8.4查询黑名单列表
 * @author Administrator
 *
 */
public class CarBlackInfoList {
	private Integer pageIndex;
	private Integer pageSize;
	private Integer totalCount;
	private List<CarBlackInfo> carBlackList;//车牌黑名单列表

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

	public List<CarBlackInfo> getCarBlackList() {
		return carBlackList;
	}

	public void setCarBlackList(List<CarBlackInfo> carBlackList) {
		this.carBlackList = carBlackList;
	}

	@Override
	public String toString() {
		return "CarBlackInfoList [pageIndex=" + pageIndex + ", pageSize=" + pageSize + ", totalCount=" + totalCount
				+ ", carBlackList=" + carBlackList + "]";
	}
}
