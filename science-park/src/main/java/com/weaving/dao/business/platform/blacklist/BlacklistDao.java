package com.weaving.dao.business.platform.blacklist;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.weaving.entry.business.platform.blacklist.Blacklist;

@Mapper
public interface BlacklistDao {

	void add(Blacklist blacklist)throws Exception;

	List<Blacklist> list(Blacklist blacklist)throws Exception;

	Integer count(Blacklist blacklist)throws Exception;

	void delete(String id)throws Exception;

}
