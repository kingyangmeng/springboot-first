package com.weaving.dao.business.platform.notice;

import org.apache.ibatis.annotations.Mapper;

import com.weaving.entry.business.platform.notice.Notice;

@Mapper
public interface NoticeDao {

	void add(Notice notice)throws Exception;

}
