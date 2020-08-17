package com.weaving.service.business.platform.rule.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.weaving.common.utils.Utils;
import com.weaving.dao.business.platform.rule.RuleDao;
import com.weaving.entry.business.platform.rule.Rule;
import com.weaving.service.business.platform.rule.RuleService;

@Service
@Transactional
public class RuleServiceImpl implements RuleService {
	@Autowired
	private RuleDao ruleDao;

	@Override
	public void add(Rule rule) throws Exception {
		rule.setId(Utils.getNumUUID());
		if (null != rule.getDate() && rule.getDate().size() > 0) {
			List<String> date = rule.getDate();
			rule.setNightStartDate(date.get(0));
			rule.setNightEndDate(date.get(1));
		}
		ruleDao.add(rule);
	}

	@Override
	public void update(Rule rule) throws Exception {
		ruleDao.update(rule);
	}

	@Override
	public Rule getRuleByParkId(String parkId) throws Exception {
		return ruleDao.getRuleInfoByParkId(parkId);
	}

}
