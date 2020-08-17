package com.weaving.thirdparty.ketuo.entry.result;

/**
 * 2.5.1账单查询/费用查询
 * @author Administrator
 *
 */
public class ParkingPaymentInfo {
	private Integer parkId;//车场id
	private String orderNo;//账单号（订单号5分钟内有效）
	private String plateNo;//车牌号(二选一)
	private String cardNo;//卡号、票号(二选一)
	private String parkName;//车场名称
	private String entryTime;//入场时间 (yyyy-MM-dd HH:mm:ss)
	private String payTime;//付款(查询费用)时间
	private Integer elapsedTime;//停车时长（分钟）
	private Integer totalAmount;//总金额（单位分）
	private Integer payable;//本次应付金额（减去优惠金额）,单位为分
	private Integer deductionAmount;//本次应付金额（减去优惠金额）,单位为分
	private Integer paidAmount;//优惠总金额（单位:分）线上优惠总金额，免费金额+ 免费时长抵扣的金额（只需计算即可，不需在停车费中减免金额）
	private Integer delayTime;//收费后允许延时出场的时间限制（分钟），默认：20分钟
	private String imgName;//停车入场图片
	private Integer imgType;//图片信息类型：2=图片URL（可公网访问地址）
	private String imgInfo;//图片URL
	private Integer carType;//固定车类型  详见参数枚举 1.6.2
	private String carStyle;//车辆类型 详见参数枚举1.6.8
	private String trafficId;//出入场唯一记录ID（v6.x有这个参数，v5.x没有）

	public Integer getParkId() {
		return parkId;
	}

	public void setParkId(Integer parkId) {
		this.parkId = parkId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getParkName() {
		return parkName;
	}

	public void setParkName(String parkName) {
		this.parkName = parkName;
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

	public Integer getElapsedTime() {
		return elapsedTime;
	}

	public void setElapsedTime(Integer elapsedTime) {
		this.elapsedTime = elapsedTime;
	}

	public Integer getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Integer getPayable() {
		return payable;
	}

	public void setPayable(Integer payable) {
		this.payable = payable;
	}

	public Integer getDeductionAmount() {
		return deductionAmount;
	}

	public void setDeductionAmount(Integer deductionAmount) {
		this.deductionAmount = deductionAmount;
	}

	public Integer getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(Integer paidAmount) {
		this.paidAmount = paidAmount;
	}

	public Integer getDelayTime() {
		return delayTime;
	}

	public void setDelayTime(Integer delayTime) {
		this.delayTime = delayTime;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public Integer getImgType() {
		return imgType;
	}

	public void setImgType(Integer imgType) {
		this.imgType = imgType;
	}

	public String getImgInfo() {
		return imgInfo;
	}

	public void setImgInfo(String imgInfo) {
		this.imgInfo = imgInfo;
	}

	public Integer getCarType() {
		return carType;
	}

	public void setCarType(Integer carType) {
		this.carType = carType;
	}

	public String getCarStyle() {
		return carStyle;
	}

	public void setCarStyle(String carStyle) {
		this.carStyle = carStyle;
	}

	public String getTrafficId() {
		return trafficId;
	}

	public void setTrafficId(String trafficId) {
		this.trafficId = trafficId;
	}

	@Override
	public String toString() {
		return "ParkingPaymentInfo [parkId=" + parkId + ", orderNo=" + orderNo + ", plateNo=" + plateNo + ", cardNo="
				+ cardNo + ", parkName=" + parkName + ", entryTime=" + entryTime + ", payTime=" + payTime
				+ ", elapsedTime=" + elapsedTime + ", totalAmount=" + totalAmount + ", payable=" + payable
				+ ", deductionAmount=" + deductionAmount + ", paidAmount=" + paidAmount + ", delayTime=" + delayTime
				+ ", imgName=" + imgName + ", imgType=" + imgType + ", imgInfo=" + imgInfo + ", carType=" + carType
				+ ", carStyle=" + carStyle + ", trafficId=" + trafficId + "]";
	}
}
