package com.weaving.dao.business.platform.log.run;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.weaving.entry.business.platform.log.run.Run;

@Mapper
public interface LogRunDao {

	void add(Run run)throws Exception;

	List<Run> list(Run run)throws Exception;

	Integer count(Run run)throws Exception;

}
