package com.weaving.thirdparty.ketuo.entry.result;

/**
 * 2.1.2停车场信息
 * @author Administrator
 *
 */
public class ParkingLotInfo {
	private Integer parkId;//车场ID
	private String parkName;//车场名称
	private Integer totalSpaceNum;//总车位数
	private Integer limitL;//限长(暂无) 0:不限制
	private Integer limitW;//限宽(暂无) 0:不限制
	private Integer limitH;//限高(暂无) 0:不限制
	private String lon ;//车场所在经度
	private String lat ;//车场所在纬度 
	private String addr;//地址
	private String tel;//电话
	private String imgUrl;//停车场图片
	private String workTime;//营业时间
	private String payRule;//计费规则

	public Integer getParkId() {
		return parkId;
	}

	public void setParkId(Integer parkId) {
		this.parkId = parkId;
	}

	public String getParkName() {
		return parkName;
	}

	public void setParkName(String parkName) {
		this.parkName = parkName;
	}

	public Integer getTotalSpaceNum() {
		return totalSpaceNum;
	}

	public void setTotalSpaceNum(Integer totalSpaceNum) {
		this.totalSpaceNum = totalSpaceNum;
	}

	public Integer getLimitL() {
		return limitL;
	}

	public void setLimitL(Integer limitL) {
		this.limitL = limitL;
	}

	public Integer getLimitW() {
		return limitW;
	}

	public void setLimitW(Integer limitW) {
		this.limitW = limitW;
	}

	public Integer getLimitH() {
		return limitH;
	}

	public void setLimitH(Integer limitH) {
		this.limitH = limitH;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getWorkTime() {
		return workTime;
	}

	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}

	public String getPayRule() {
		return payRule;
	}

	public void setPayRule(String payRule) {
		this.payRule = payRule;
	}

	@Override
	public String toString() {
		return "ParkingLotInfo [parkId=" + parkId + ", parkName=" + parkName + ", totalSpaceNum=" + totalSpaceNum
				+ ", limitL=" + limitL + ", limitW=" + limitW + ", limitH=" + limitH + ", lon=" + lon + ", lat=" + lat
				+ ", addr=" + addr + ", tel=" + tel + ", imgUrl=" + imgUrl + ", workTime=" + workTime + ", payRule="
				+ payRule + "]";
	}
}
