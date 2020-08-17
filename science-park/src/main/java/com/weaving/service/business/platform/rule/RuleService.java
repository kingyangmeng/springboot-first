package com.weaving.service.business.platform.rule;

import com.weaving.entry.business.platform.rule.Rule;

public interface RuleService {

	void add(Rule rule) throws Exception;

	void update(Rule rule) throws Exception;

	Rule getRuleByParkId(String parkId) throws Exception;

}
