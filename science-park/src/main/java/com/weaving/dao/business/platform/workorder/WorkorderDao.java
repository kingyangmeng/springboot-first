package com.weaving.dao.business.platform.workorder;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.weaving.entry.business.platform.workorder.Workorder;

@Mapper
public interface WorkorderDao {

	void add(Workorder order)throws Exception;

	List<Workorder> list(Workorder order)throws Exception;

	Integer count(Workorder order)throws Exception;

}
