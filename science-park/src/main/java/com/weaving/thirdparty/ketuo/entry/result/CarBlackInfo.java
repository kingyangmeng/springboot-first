package com.weaving.thirdparty.ketuo.entry.result;

/**
 * 2.8.4查询黑名单列表
 * @author Administrator
 *
 */
public class CarBlackInfo {
	private String plateNo;//车牌号码  必填
	private String remark;//原因备注
	private Integer type;//限制类型 1.禁入 2.禁出 3.禁止出入

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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CarBlackInfo [plateNo=" + plateNo + ", remark=" + remark + ", type=" + type + "]";
	}
}
