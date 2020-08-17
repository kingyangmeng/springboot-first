package com.weaving.thirdparty.ketuo.entry.param;

/**
 * 黑名单
 * 
 * @author yang
 *
 */
public class BlacklistParam extends BaseEntry {
	private String plateNo;
	private String remark;
	private int type;// 限制类型 1.禁入 2.禁出 3.禁止出入

	private int pageIndex;// 第N页，从1开始，N>=1；默认：1
	private int pageSize;// 每一页数量 >=1；默认：10

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public String toString() {
		return "BlacklistParam [plateNo=" + plateNo + ", remark=" + remark + ", type=" + type + ", pageIndex="
				+ pageIndex + ", pageSize=" + pageSize + ", getPlateNo()=" + getPlateNo() + ", getRemark()="
				+ getRemark() + ", getType()=" + getType() + ", getPageIndex()=" + getPageIndex() + ", getPageSize()="
				+ getPageSize() + ", getAppId()=" + getAppId() + ", getKey()=" + getKey() + ", getParkId()="
				+ getParkId() + ", getServiceCode()=" + getServiceCode() + ", getTs()=" + getTs() + ", getReqId()="
				+ getReqId() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
