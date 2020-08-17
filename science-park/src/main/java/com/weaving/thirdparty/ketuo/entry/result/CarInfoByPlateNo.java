package com.weaving.thirdparty.ketuo.entry.result;

/**
 * 2.6.7根据车牌查询在场数据
 * @author Administrator
 *
 */
public class CarInfoByPlateNo {
	private String trafficId;//出入场唯一记录ID
	private String plateNo;//车牌号，全车牌
	private String entryTime;//入场时间  (yyyy-MM-dd HH:mm:ss)
	private Integer parkingTime;//总停车时间（分钟）
	private String imgName;//车辆进出场图片名称 
	private Integer imgType;//图片信息类型：1：base64位图片信息；2=图片URL（可公网访问地址）
	private String imgInfo;//图片信息
	private String entryPlace;//车辆进出场地点
	private Integer carType;//固定车类型  详见参数枚举 1.6.2
	private String carColor;//车颜色 黑、白、蓝、红等1.6.11
	private String carStyle;//车辆类型 详见参数枚举1.6.8
	private String plateColor;//车牌颜色  详见参数枚举（白、黑、灰等）

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

	public Integer getParkingTime() {
		return parkingTime;
	}

	public void setParkingTime(Integer parkingTime) {
		this.parkingTime = parkingTime;
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

	public String getEntryPlace() {
		return entryPlace;
	}

	public void setEntryPlace(String entryPlace) {
		this.entryPlace = entryPlace;
	}

	public Integer getCarType() {
		return carType;
	}

	public void setCarType(Integer carType) {
		this.carType = carType;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getCarStyle() {
		return carStyle;
	}

	public void setCarStyle(String carStyle) {
		this.carStyle = carStyle;
	}

	public String getPlateColor() {
		return plateColor;
	}

	public void setPlateColor(String plateColor) {
		this.plateColor = plateColor;
	}

	@Override
	public String toString() {
		return "CarInfoByPlateNo [trafficId=" + trafficId + ", plateNo=" + plateNo + ", entryTime=" + entryTime
				+ ", parkingTime=" + parkingTime + ", imgName=" + imgName + ", imgType=" + imgType + ", imgInfo="
				+ imgInfo + ", entryPlace=" + entryPlace + ", carType=" + carType + ", carColor=" + carColor
				+ ", carStyle=" + carStyle + ", plateColor=" + plateColor + "]";
	}
}
