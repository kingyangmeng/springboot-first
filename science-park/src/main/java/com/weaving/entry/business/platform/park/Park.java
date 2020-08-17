package com.weaving.entry.business.platform.park;

import java.util.List;

import com.weaving.entry.business.platform.rule.Rule;
import com.weaving.entry.sys.comm.Comm;

/**
 * 停车场信息
 * 
 * @author yang
 *
 */
public class Park extends Comm {

	private String id;
	private String parkId;// 车场Id（对接使用）
	private List<String> area;// 省、市、区
	private String province;// 省
	private String city;// 市
	private String district;// 区
	private String address;
	private String parkName;// 停车场名称
	private String operation;// 运营主管
	private String operationId;// 运营主管Id
	private String longitude;// 经度
	private String latitude;// 纬度
	private String status = "1";// 是否停用 0 停用 1：正常使用
	private String appId;// 车场对接提供
	private String secretKey;// 车场对接提供app密钥

	private Rule rule;//收费规则

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParkId() {
		return parkId;
	}

	public void setParkId(String parkId) {
		this.parkId = parkId;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getParkName() {
		return parkName;
	}

	public void setParkName(String parkName) {
		this.parkName = parkName;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getOperationId() {
		return operationId;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public List<String> getArea() {
		return area;
	}

	public void setArea(List<String> area) {
		this.area = area;
	}

	public Rule getRule() {
		return rule;
	}

	public void setRule(Rule rule) {
		this.rule = rule;
	}

	@Override
	public String toString() {
		return "Park [id=" + id + ", parkId=" + parkId + ", area=" + area + ", province=" + province + ", city=" + city
				+ ", district=" + district + ", address=" + address + ", parkName=" + parkName + ", operation="
				+ operation + ", operationId=" + operationId + ", longitude=" + longitude + ", latitude=" + latitude
				+ ", status=" + status + ", appId=" + appId + ", secretKey=" + secretKey + ", rule=" + rule + "]";
	}

}
