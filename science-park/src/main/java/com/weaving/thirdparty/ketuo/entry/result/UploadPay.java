package com.weaving.thirdparty.ketuo.entry.result;

/**
 * 2.3.4获取缴费记录上报所需要的数据
 * @author Administrator
 *
 */
public class UploadPay {
	private String plateNo;//车牌号、票号
	private String entryTime;//入场时间
	private String payTime;//支付时间
	private Integer paySource;//支付来源 详见参数枚举 1.6.5
	private Integer payType;//收费终端，详见参数枚举1.6.4
	private Integer payMethod;//付款方式，详见参数枚举 1.6.3
	private Integer totalMoney;//应收总金额（单位分）
	private Integer paidMoney;//实收总金额（单位分）
	private Integer freeTime;//抵扣时长（单位秒）
	private Integer freeMoney;//抵扣金额（单位分）
	private String orderNo;//车场订单号
	private String paymentOrderNo;//支付定单号
	private String syncTime;//订单创建时间

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(String entryTime) {
		this.entryTime = entryTime;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public Integer getPaySource() {
		return paySource;
	}

	public void setPaySource(Integer paySource) {
		this.paySource = paySource;
	}

	public Integer getPayType() {
		return payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	public Integer getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(Integer payMethod) {
		this.payMethod = payMethod;
	}

	public Integer getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(Integer totalMoney) {
		this.totalMoney = totalMoney;
	}

	public Integer getPaidMoney() {
		return paidMoney;
	}

	public void setPaidMoney(Integer paidMoney) {
		this.paidMoney = paidMoney;
	}

	public Integer getFreeTime() {
		return freeTime;
	}

	public void setFreeTime(Integer freeTime) {
		this.freeTime = freeTime;
	}

	public Integer getFreeMoney() {
		return freeMoney;
	}

	public void setFreeMoney(Integer freeMoney) {
		this.freeMoney = freeMoney;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPaymentOrderNo() {
		return paymentOrderNo;
	}

	public void setPaymentOrderNo(String paymentOrderNo) {
		this.paymentOrderNo = paymentOrderNo;
	}

	public String getSyncTime() {
		return syncTime;
	}

	public void setSyncTime(String syncTime) {
		this.syncTime = syncTime;
	}

	@Override
	public String toString() {
		return "UploadPay [plateNo=" + plateNo + ", entryTime=" + entryTime + ", payTime=" + payTime + ", paySource="
				+ paySource + ", payType=" + payType + ", payMethod=" + payMethod + ", totalMoney=" + totalMoney
				+ ", paidMoney=" + paidMoney + ", freeTime=" + freeTime + ", freeMoney=" + freeMoney + ", orderNo="
				+ orderNo + ", paymentOrderNo=" + paymentOrderNo + ", syncTime=" + syncTime + "]";
	}
}
