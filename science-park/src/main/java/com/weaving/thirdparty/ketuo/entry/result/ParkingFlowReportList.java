package com.weaving.thirdparty.ketuo.entry.result;

import java.util.List;

/**
 * 2.3.3查询时间段收入、车流
 * @author Administrator
 *
 */
public class ParkingFlowReportList {
	private Integer totalTraffic;//总车流量
	private Integer inNum;//进场总数
	private Integer outNum;//出场总数
	private Integer totalPay;//总收费笔数
	private Integer totalMoney;//总收费金额(分)
	private List<ParkingFlowReport> payDetailList;//各支付方式明细

	public Integer getTotalTraffic() {
		return totalTraffic;
	}

	public void setTotalTraffic(Integer totalTraffic) {
		this.totalTraffic = totalTraffic;
	}

	public Integer getInNum() {
		return inNum;
	}

	public void setInNum(Integer inNum) {
		this.inNum = inNum;
	}

	public Integer getOutNum() {
		return outNum;
	}

	public void setOutNum(Integer outNum) {
		this.outNum = outNum;
	}

	public Integer getTotalPay() {
		return totalPay;
	}

	public void setTotalPay(Integer totalPay) {
		this.totalPay = totalPay;
	}

	public Integer getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(Integer totalMoney) {
		this.totalMoney = totalMoney;
	}

	public List<ParkingFlowReport> getPayDetailList() {
		return payDetailList;
	}

	public void setPayDetailList(List<ParkingFlowReport> payDetailList) {
		this.payDetailList = payDetailList;
	}

	@Override
	public String toString() {
		return "ParkingFlowReportList [totalTraffic=" + totalTraffic + ", inNum=" + inNum + ", outNum=" + outNum
				+ ", totalPay=" + totalPay + ", totalMoney=" + totalMoney + ", payDetailList=" + payDetailList + "]";
	}
}
