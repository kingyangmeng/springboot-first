package com.weaving.thirdparty.ketuo.entry.result;

import java.util.List;

/**
 * 2.1.5通道信息
 * @author Administrator
 *
 */
public class ParkingNodeList {
	private Integer pageIndex;//页数：>=1
	private Integer pageSize;
	private Integer totalCount;//总记录数
	private List<ParkingNode> nodeList;//通道详细信息

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

	public List<ParkingNode> getNodeList() {
		return nodeList;
	}

	public void setNodeList(List<ParkingNode> nodeList) {
		this.nodeList = nodeList;
	}

	@Override
	public String toString() {
		return "ParkingNodeList [pageIndex=" + pageIndex + ", pageSize=" + pageSize + ", totalCount=" + totalCount
				+ ", nodeList=" + nodeList + "]";
	}
}
