package com.weaving.thirdparty.ketuo.entry.result;

/**
 * 2.3.2查询缴费记录
 * @author Administrator
 *
 */
public class ParkingPayment {
	private String plateNo;//车牌号
	private String inTime;//进场时间 yyyy-MM-dd HH:mm:ss
	private String outTime;//出场时间 yyyy-MM-dd HH:mm:ss
	private Integer parkLong;//停车时长（秒）
	private Integer carType;//固定车类型  详见参数枚举 1.6.2
	private Integer payType;//收费终端，详见参数枚举 1.6.4
	private Integer payMethod;//付款方式 详见参数枚举 1.6.3
	private Integer parkFee;//停车费用(单位分)

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public String getOutTime() {
		return outTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	public Integer getParkLong() {
		return parkLong;
	}

	public void setParkLong(Integer parkLong) {
		this.parkLong = parkLong;
	}

	public Integer getCarType() {
		return carType;
	}

	public void setCarType(Integer carType) {
		this.carType = carType;
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

	public Integer getParkFee() {
		return parkFee;
	}

	public void setParkFee(Integer parkFee) {
		this.parkFee = parkFee;
	}

	@Override
	public String toString() {
		return "ParkingPayment [plateNo=" + plateNo + ", inTime=" + inTime + ", outTime=" + outTime + ", parkLong="
				+ parkLong + ", carType=" + carType + ", payType=" + payType + ", payMethod=" + payMethod + ", parkFee="
				+ parkFee + "]";
	}
}
