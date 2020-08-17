package com.weaving.thirdparty.ketuo.entry.result;

/**
 * 2.2.5充值规则查询
 * @author Administrator
 *
 */
public class CarCardRule {
	private String ruleName;//规则名称
	private Integer rechargeAmount;//充值数额
	private Integer rechargeType;//充值类型(0 钱(单位:分),1 月,2 天,3 小时,4次)
	private Integer basicMoney;//基本金额(单位:分)
	private Integer sentAmount;//赠送数额
	private Integer sentType;//赠送类型(0 钱(单位:分),1 月,2 天,3 小时,4次)

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public Integer getRechargeAmount() {
		return rechargeAmount;
	}

	public void setRechargeAmount(Integer rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}

	public Integer getRechargeType() {
		return rechargeType;
	}

	public void setRechargeType(Integer rechargeType) {
		this.rechargeType = rechargeType;
	}

	public Integer getBasicMoney() {
		return basicMoney;
	}

	public void setBasicMoney(Integer basicMoney) {
		this.basicMoney = basicMoney;
	}

	public Integer getSentAmount() {
		return sentAmount;
	}

	public void setSentAmount(Integer sentAmount) {
		this.sentAmount = sentAmount;
	}

	public Integer getSentType() {
		return sentType;
	}

	public void setSentType(Integer sentType) {
		this.sentType = sentType;
	}

	@Override
	public String toString() {
		return "CarCardRule [ruleName=" + ruleName + ", rechargeAmount=" + rechargeAmount + ", rechargeType="
				+ rechargeType + ", basicMoney=" + basicMoney + ", sentAmount=" + sentAmount + ", sentType=" + sentType
				+ "]";
	}
}
