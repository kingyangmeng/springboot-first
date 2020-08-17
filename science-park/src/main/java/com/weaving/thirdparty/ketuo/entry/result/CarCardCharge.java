package com.weaving.thirdparty.ketuo.entry.result;

/**
 * 2.2.8查询固定车充值信息
 * @author Administrator
 *
 */
public class CarCardCharge {
	private Integer cardId;//卡片ID 
	private String orderNo;//订单号
	private Integer carType;//固定车类型 详见参数枚举 1.6.2
	private Integer payChannel;//支付渠道
	private Integer chargeMethod;//充值方式,(0 钱(单位:分),1 月,2 天,3 小时,4次)
	private Integer chargeNumber;//充值车的充值月数或天数或次数
	private Integer amount;//支付金额（单位：分）
	private Integer freeNumber;//免费赠送的月数或天数或次数
	private String validFrom ;//充值开始时间建议00:00:00(yyyy-MM-dd HH:mm:ss）
	private String validTo;//充值结束时间建议23:59:59(yyyy-MM-dd HH:mm:ss）
	private String createTime;//创建时间(格式：yyyy-MM-dd HH:mm:ss)
	private String remark;//备注
	private Integer rechargeType;//充值类型(0:充值,1:退款)

	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Integer getCarType() {
		return carType;
	}

	public void setCarType(Integer carType) {
		this.carType = carType;
	}

	public Integer getPayChannel() {
		return payChannel;
	}

	public void setPayChannel(Integer payChannel) {
		this.payChannel = payChannel;
	}

	public Integer getChargeMethod() {
		return chargeMethod;
	}

	public void setChargeMethod(Integer chargeMethod) {
		this.chargeMethod = chargeMethod;
	}

	public Integer getChargeNumber() {
		return chargeNumber;
	}

	public void setChargeNumber(Integer chargeNumber) {
		this.chargeNumber = chargeNumber;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getFreeNumber() {
		return freeNumber;
	}

	public void setFreeNumber(Integer freeNumber) {
		this.freeNumber = freeNumber;
	}

	public String getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	public String getValidTo() {
		return validTo;
	}

	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getRechargeType() {
		return rechargeType;
	}

	public void setRechargeType(Integer rechargeType) {
		this.rechargeType = rechargeType;
	}

	@Override
	public String toString() {
		return "CarCardCharge [cardId=" + cardId + ", orderNo=" + orderNo + ", carType=" + carType + ", payChannel="
				+ payChannel + ", chargeMethod=" + chargeMethod + ", chargeNumber=" + chargeNumber + ", amount="
				+ amount + ", freeNumber=" + freeNumber + ", validFrom=" + validFrom + ", validTo=" + validTo
				+ ", createTime=" + createTime + ", remark=" + remark + ", rechargeType=" + rechargeType + "]";
	}
}
