package com.weaving.entry.business.platform.access;

import com.weaving.entry.business.platform.payinfo.PayMentInfo;
import com.weaving.thirdparty.ketuo.entry.param.BaseEntry;

/**
 * 通行记录
 * 
 * @author yang
 *
 */
public class Access extends BaseEntry {
	private String id;
	private String trafficId;// 出入场唯一记录ID
	private String plateNo;// 车牌号
	private String entryTime;// 入场时间
	private String leaveTime;// 出场时间
	private int carType;// 卡片类型
	private String leavePlace;// 出口名称/出口ip/设备编码 三选一
	private String imgName;// 出口抓拍图片名称
	private int imgType;// 图片信息类型：2=图片URL（可公网访问地址）
	private String imgInfo;// 图片URL
	private int area;// 场中场标识（0=否 1=是）
	private String recognitionCredibility;// 识别可信度
	private int passType;// 放行类型，详见参数枚举1.7.0
	private String passRemark;// 放行说明
	private int freeLots;// 剩余车位
	private int totalLots;// 总车位
	private PayMentInfo payMentInfo;// 支付信息

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTrafficId() {
		return trafficId;
	}

	public void setTrafficId(String trafficId) {
		this.trafficId = trafficId;
	}

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

	public String getLeaveTime() {
		return leaveTime;
	}

	public void setLeaveTime(String leaveTime) {
		this.leaveTime = leaveTime;
	}

	public int getCarType() {
		return carType;
	}

	public void setCarType(int carType) {
		this.carType = carType;
	}

	public String getLeavePlace() {
		return leavePlace;
	}

	public void setLeavePlace(String leavePlace) {
		this.leavePlace = leavePlace;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public int getImgType() {
		return imgType;
	}

	public void setImgType(int imgType) {
		this.imgType = imgType;
	}

	public String getImgInfo() {
		return imgInfo;
	}

	public void setImgInfo(String imgInfo) {
		this.imgInfo = imgInfo;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getRecognitionCredibility() {
		return recognitionCredibility;
	}

	public void setRecognitionCredibility(String recognitionCredibility) {
		this.recognitionCredibility = recognitionCredibility;
	}

	public int getPassType() {
		return passType;
	}

	public void setPassType(int passType) {
		this.passType = passType;
	}

	public String getPassRemark() {
		return passRemark;
	}

	public void setPassRemark(String passRemark) {
		this.passRemark = passRemark;
	}

	public int getFreeLots() {
		return freeLots;
	}

	public void setFreeLots(int freeLots) {
		this.freeLots = freeLots;
	}

	public int getTotalLots() {
		return totalLots;
	}

	public void setTotalLots(int totalLots) {
		this.totalLots = totalLots;
	}

	public PayMentInfo getPayMentInfo() {
		return payMentInfo;
	}

	public void setPayMentInfo(PayMentInfo payMentInfo) {
		this.payMentInfo = payMentInfo;
	}

	@Override
	public String toString() {
		return "Access [id=" + id + ", plateNo=" + plateNo + ", entryTime=" + entryTime + ", leaveTime=" + leaveTime
				+ ", carType=" + carType + ", leavePlace=" + leavePlace + ", imgName=" + imgName + ", imgType="
				+ imgType + ", imgInfo=" + imgInfo + ", area=" + area + ", recognitionCredibility="
				+ recognitionCredibility + ", passType=" + passType + ", passRemark=" + passRemark + ", freeLots="
				+ freeLots + ", totalLots=" + totalLots + ", payMentInfo=" + payMentInfo + ", getId()=" + getId()
				+ ", getPlateNo()=" + getPlateNo() + ", getEntryTime()=" + getEntryTime() + ", getLeaveTime()="
				+ getLeaveTime() + ", getCarType()=" + getCarType() + ", getLeavePlace()=" + getLeavePlace()
				+ ", getImgName()=" + getImgName() + ", getImgType()=" + getImgType() + ", getImgInfo()=" + getImgInfo()
				+ ", getArea()=" + getArea() + ", getRecognitionCredibility()=" + getRecognitionCredibility()
				+ ", getPassType()=" + getPassType() + ", getPassRemark()=" + getPassRemark() + ", getFreeLots()="
				+ getFreeLots() + ", getTotalLots()=" + getTotalLots() + ", getPayMentInfo()=" + getPayMentInfo()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
