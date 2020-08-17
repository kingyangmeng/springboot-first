package com.weaving.thirdparty.ketuo.entry.result;

/**
 * 2.3.1查询进出记录
 * @author Administrator
 *
 */
public class CarInoutInfo {
	private String plateNo;//
	private Integer capFlag;//进出标志 0-进 1-出
	private String capTime;//入场时间（yyyy-MM-dd HH:mm:ss）
	private String imgName;//车辆进出场图片名称 
	private Integer imgType;//图片信息类型：1：base64位图片信息；2=图片URL（可公网访问地址）
	private String imgInfo;//图片信息
	private String capPlace;//车辆进出场地点
	private Integer carType;//固定车类型  详见参数枚举 1.6.2
	private String carColor;//string	车颜色 黑、白、蓝、红等
	private String carStyle;//车辆类型 ,详见参数枚举1.6.8

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public Integer getCapFlag() {
		return capFlag;
	}

	public void setCapFlag(Integer capFlag) {
		this.capFlag = capFlag;
	}

	public String getCapTime() {
		return capTime;
	}

	public void setCapTime(String capTime) {
		this.capTime = capTime;
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

	public String getCapPlace() {
		return capPlace;
	}

	public void setCapPlace(String capPlace) {
		this.capPlace = capPlace;
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

	@Override
	public String toString() {
		return "CarInoutInfo [plateNo=" + plateNo + ", capFlag=" + capFlag + ", capTime=" + capTime + ", imgName="
				+ imgName + ", imgType=" + imgType + ", imgInfo=" + imgInfo + ", capPlace=" + capPlace + ", carType="
				+ carType + ", carColor=" + carColor + ", carStyle=" + carStyle + "]";
	}
}
