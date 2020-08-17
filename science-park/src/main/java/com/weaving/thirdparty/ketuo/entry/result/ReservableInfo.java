package com.weaving.thirdparty.ketuo.entry.result;

/**
 * 2.4.4预订车位查询接口
 * @author Administrator
 *
 */
public class ReservableInfo {
	private Integer type;//类型：0：车位 1：区域
	private String addrId;//车位/区域ID
	private String addrName;//车位/区域名称

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getAddrId() {
		return addrId;
	}

	public void setAddrId(String addrId) {
		this.addrId = addrId;
	}

	public String getAddrName() {
		return addrName;
	}

	public void setAddrName(String addrName) {
		this.addrName = addrName;
	}

	@Override
	public String toString() {
		return "ReservableInfo [type=" + type + ", addrId=" + addrId + ", addrName=" + addrName + "]";
	}
}
