package com.weaving.service.business.platform.log.exception.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.weaving.common.PageUtils;
import com.weaving.common.utils.Utils;
import com.weaving.dao.business.platform.log.exception.LogExceptionDao;
import com.weaving.entry.business.platform.log.exception.Exception;
import com.weaving.service.business.platform.log.exception.LogExceptionService;

@Service
@Transactional
public class LogExceptionServiceImpl implements LogExceptionService {

	@Autowired
	private LogExceptionDao logExceptionDao;

	@Override
	public void add(Exception exception) {
		exception.setId(Utils.getNumUUID());
		logExceptionDao.add(exception);
	}

	@Override
	public PageUtils<Exception> list(Exception exception, Integer pageNum, Integer pageSize) {
		Integer index = pageSize * (pageNum - 1);
		Integer num = pageSize;

		exception.setIndex(index);
		exception.setNum(num);

		List<Exception> list = logExceptionDao.list(exception);
		Integer count = logExceptionDao.count(exception);
		PageUtils<Exception> page = new PageUtils<Exception>(pageNum, pageSize, count, list);
		return page;
	}

}
