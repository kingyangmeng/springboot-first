package com.weaving.thirdparty.ketuo.entry.result;

import java.util.List;

/**
 * 2.2.8查询固定车充值信息
 * @author Administrator
 *
 */
public class CarCardChargeList {
	private Integer pageIndex;
	private Integer pageSize;
	private Integer totalCount;
	private List<CarCardCharge> chargeList;

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

	public List<CarCardCharge> getChargeList() {
		return chargeList;
	}

	public void setChargeList(List<CarCardCharge> chargeList) {
		this.chargeList = chargeList;
	}

	@Override
	public String toString() {
		return "CarCardChargeList [pageIndex=" + pageIndex + ", pageSize=" + pageSize + ", totalCount=" + totalCount
				+ ", chargeList=" + chargeList + "]";
	}
}
