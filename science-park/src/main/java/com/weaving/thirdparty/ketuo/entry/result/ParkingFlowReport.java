package com.weaving.thirdparty.ketuo.entry.result;

/**
 * 2.3.3查询时间段收入、车流
 * @author Administrator
 *
 */
public class ParkingFlowReport {
	private Integer payMethod;//支付方式，详见1.6.3支付方式枚举
	private Integer payTotalCount;//支付笔数
	private Integer payTotalMoney;//支付总额
	private Integer ticketMoney;//抵用券金额(分)
	private Integer ticketTime;//抵用券时长(小时)

	public Integer getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(Integer payMethod) {
		this.payMethod = payMethod;
	}

	public Integer getPayTotalCount() {
		return payTotalCount;
	}

	public void setPayTotalCount(Integer payTotalCount) {
		this.payTotalCount = payTotalCount;
	}

	public Integer getPayTotalMoney() {
		return payTotalMoney;
	}

	public void setPayTotalMoney(Integer payTotalMoney) {
		this.payTotalMoney = payTotalMoney;
	}

	public Integer getTicketMoney() {
		return ticketMoney;
	}

	public void setTicketMoney(Integer ticketMoney) {
		this.ticketMoney = ticketMoney;
	}

	public Integer getTicketTime() {
		return ticketTime;
	}

	public void setTicketTime(Integer ticketTime) {
		this.ticketTime = ticketTime;
	}

	@Override
	public String toString() {
		return "ParkingFlowReport [payMethod=" + payMethod + ", payTotalCount=" + payTotalCount + ", payTotalMoney="
				+ payTotalMoney + ", ticketMoney=" + ticketMoney + ", ticketTime=" + ticketTime + "]";
	}
}
