package com.weaving.dao.business.platform.log.exception;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.weaving.entry.business.platform.log.exception.Exception;

@Mapper
public interface LogExceptionDao {

	void add(Exception exception);

	List<Exception> list(Exception exception);

	Integer count(Exception exception);

}
