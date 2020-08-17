package com.weaving.thirdparty.ketuo.entry.result;

import java.util.List;

/**
 * 2.4.4预订车位查询接口
 * @author Administrator
 *
 */
public class ReservableInfoList {
	private Integer totalNum;//总可预订车位数
	private List<ReservableInfo> reserveList;//预约信息

	public Integer getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public List<ReservableInfo> getReserveList() {
		return reserveList;
	}

	public void setReserveList(List<ReservableInfo> reserveList) {
		this.reserveList = reserveList;
	}

	@Override
	public String toString() {
		return "ReservableInfoList [totalNum=" + totalNum + ", reserveList=" + reserveList + "]";
	}
}
