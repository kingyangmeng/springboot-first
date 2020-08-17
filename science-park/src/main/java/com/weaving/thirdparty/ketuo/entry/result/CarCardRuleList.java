package com.weaving.thirdparty.ketuo.entry.result;

import java.util.List;

/**
 * 2.2.5充值规则查询
 * @author Administrator
 *
 */
public class CarCardRuleList {
	private List<CarCardRule> ruleList;//充值规则列表

	public List<CarCardRule> getRuleList() {
		return ruleList;
	}

	public void setRuleList(List<CarCardRule> ruleList) {
		this.ruleList = ruleList;
	}

	@Override
	public String toString() {
		return "CarCardRuleList [ruleList=" + ruleList + "]";
	}
}
