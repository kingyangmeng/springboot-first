package com.weaving.thirdparty.ketuo.entry.result;

/**
 * 2.2.2固定车信息
 * @author Administrator
 *
 */
public class CarCardInfo {
	private Integer id;//车位ID
	private String lotName;//车位名称
	private Integer carType;//车牌类型编码
	private String carTypeName;//车牌类型名称
	private String areaName;//区域名称
	private String areaId;//区域id
	private String beginTime;//有效期开始时间
	private String endTime;//有效期结束时间
	private Integer lotCount;//占用车位个数
	private Integer validValue;//卡内余额(充值车：分，计次车：次)
	private String plateNoInfo;//车牌列表 json数组字符串
	private String plateNo;//车牌号,二选一
	private String etcNo;//卡片id,二选一
	private String lastUpdateTime;//最后一次更新时间yyyy-MM-dd 00:00:00

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLotName() {
		return lotName;
	}

	public void setLotName(String lotName) {
		this.lotName = lotName;
	}

	public String getCarTypeName() {
		return carTypeName;
	}

	public void setCarTypeName(String carTypeName) {
		this.carTypeName = carTypeName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getPlateNoInfo() {
		return plateNoInfo;
	}

	public void setPlateNoInfo(String plateNoInfo) {
		this.plateNoInfo = plateNoInfo;
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getEtcNo() {
		return etcNo;
	}

	public void setEtcNo(String etcNo) {
		this.etcNo = etcNo;
	}

	public String getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	
	public Integer getCarType() {
		return carType;
	}

	public void setCarType(Integer carType) {
		this.carType = carType;
	}

	public Integer getLotCount() {
		return lotCount;
	}

	public void setLotCount(Integer lotCount) {
		this.lotCount = lotCount;
	}

	public Integer getValidValue() {
		return validValue;
	}

	public void setValidValue(Integer validValue) {
		this.validValue = validValue;
	}

	@Override
	public String toString() {
		return "CarCardInfo [id=" + id + ", lotName=" + lotName + ", carType=" + carType + ", carTypeName="
				+ carTypeName + ", areaName=" + areaName + ", areaId=" + areaId + ", beginTime=" + beginTime
				+ ", endTime=" + endTime + ", lotCount=" + lotCount + ", validValue=" + validValue + ", plateNoInfo="
				+ plateNoInfo + ", plateNo=" + plateNo + ", etcNo=" + etcNo + ", lastUpdateTime=" + lastUpdateTime
				+ "]";
	}
}
