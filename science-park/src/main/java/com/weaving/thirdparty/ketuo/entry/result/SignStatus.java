package com.weaving.thirdparty.ketuo.entry.result;

/**
 * 2.5.7车辆无感支付签约状态查询接口
 * @author Administrator
 *
 */
public class SignStatus {
	private Integer signed;//是否签约无感支付0：否（解约）；1：是
	private Integer payMethod;//无感付款方式，详见参数枚举 1.6.3

	public Integer getSigned() {
		return signed;
	}

	public void setSigned(Integer signed) {
		this.signed = signed;
	}

	public Integer getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(Integer payMethod) {
		this.payMethod = payMethod;
	}

	@Override
	public String toString() {
		return "SignStatus [signed=" + signed + ", payMethod=" + payMethod + "]";
	}
}
