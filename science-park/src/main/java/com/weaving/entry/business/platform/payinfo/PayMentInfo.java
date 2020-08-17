package com.weaving.entry.business.platform.payinfo;

/**
 * 车辆进出支付信息
 * 
 * @author yang
 *
 */
public class PayMentInfo {
	private int totalMoney; // 应收总金额（单位分）
	private int paidMoney;// 实收总金额（单位分）
	private int freeTime;// 抵扣时长（单位秒）
	private int freeMoney; // 抵扣金额（单位分）
	private int isPostPay; // 后付费出场（0=否 1=是）

	public int getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}

	public int getPaidMoney() {
		return paidMoney;
	}

	public void setPaidMoney(int paidMoney) {
		this.paidMoney = paidMoney;
	}

	public int getFreeTime() {
		return freeTime;
	}

	public void setFreeTime(int freeTime) {
		this.freeTime = freeTime;
	}

	public int getFreeMoney() {
		return freeMoney;
	}

	public void setFreeMoney(int freeMoney) {
		this.freeMoney = freeMoney;
	}

	public int getIsPostPay() {
		return isPostPay;
	}

	public void setIsPostPay(int isPostPay) {
		this.isPostPay = isPostPay;
	}

	@Override
	public String toString() {
		return "PayMentInfo [totalMoney=" + totalMoney + ", paidMoney=" + paidMoney + ", freeTime=" + freeTime
				+ ", freeMoney=" + freeMoney + ", isPostPay=" + isPostPay + "]";
	}

}
