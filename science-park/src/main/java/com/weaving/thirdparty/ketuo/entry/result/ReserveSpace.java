package com.weaving.thirdparty.ketuo.entry.result;

/**
 * 2.4.1用户车位预订
 * @author Administrator
 *
 */
public class ReserveSpace {
	private String orderNo;//预约订单号
	private String keepTime;//保留时间(最迟入场时间) yyyy-MM-dd HH:mm:ss

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getKeepTime() {
		return keepTime;
	}

	public void setKeepTime(String keepTime) {
		this.keepTime = keepTime;
	}

	@Override
	public String toString() {
		return "ReserveSpace [orderNo=" + orderNo + ", keepTime=" + keepTime + "]";
	}
}
