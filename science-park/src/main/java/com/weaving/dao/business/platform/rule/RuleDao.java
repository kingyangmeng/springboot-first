package com.weaving.dao.business.platform.rule;

import org.apache.ibatis.annotations.Mapper;

import com.weaving.entry.business.platform.rule.Rule;

@Mapper
public interface RuleDao {

	void add(Rule rule) throws Exception;

	void update(Rule rule) throws Exception;

	Rule getRuleInfoByParkId(String parkId) throws Exception;

}
