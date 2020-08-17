package com.weaving.thirdparty.ketuo.entry.param;

/**
 * 1.停车场列表  
 * 2.停车场信息
 * 
 * @author yang
 *
 */
public class ParkingParam extends BaseEntry {

	private int pageIndex;// 第N页，从1开始，N>=1；默认：1
	private int pageSize;// 每一页数量 >=1；默认：10

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
