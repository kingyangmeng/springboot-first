package com.weaving.thirdparty.ketuo.entry.param;

/**
 * 科拓对接
 * 
 * @author yang 基础的请求参数
 */
public class BaseEntry {

	private Integer appId; // "授权码"
	private String key;// "验证码"
	private String parkId;// "车场id"
	private String serviceCode; // 业务代码
	private Long ts; // 请求时间
	private String reqId;// 每次请求唯一标识

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getParkId() {
		return parkId;
	}

	public void setParkId(String parkId) {
		this.parkId = parkId;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public Long getTs() {
		return ts;
	}

	public void setTs(Long ts) {
		this.ts = ts;
	}

	public String getReqId() {
		return reqId;
	}

	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	@Override
	public String toString() {
		return "BaseEntry [appId=" + appId + ", key=" + key + ", parkId=" + parkId + ", serviceCode=" + serviceCode
				+ ", ts=" + ts + ", reqId=" + reqId + "]";
	}

}
