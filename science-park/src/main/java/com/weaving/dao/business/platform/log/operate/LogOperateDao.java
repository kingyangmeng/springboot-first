package com.weaving.dao.business.platform.log.operate;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.weaving.entry.business.platform.log.operate.Operate;

@Mapper
public interface LogOperateDao {

	void add(Operate operate)throws Exception;

	List<Operate> list(Operate operate)throws Exception;

	Integer count(Operate operate)throws Exception;

}
