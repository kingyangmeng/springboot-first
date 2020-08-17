package com.weaving.service.business.platform.log.run.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.weaving.common.PageUtils;
import com.weaving.common.utils.Utils;
import com.weaving.dao.business.platform.log.run.LogRunDao;
import com.weaving.entry.business.platform.log.run.Run;
import com.weaving.service.business.platform.log.run.LogRunService;

@Service
@Transactional
public class LogRunServiceImpl implements LogRunService {

	@Autowired
	private LogRunDao logRunDao;

	@Override
	public void add(Run run) throws Exception{
		run.setId(Utils.getNumUUID());
		logRunDao.add(run);
	}

	@Override
	public PageUtils<Run> list(Run run, Integer pageNum, Integer pageSize) throws Exception{
		Integer index = pageSize * (pageNum - 1);
		Integer num = pageSize;

		run.setIndex(index);
		run.setNum(num);

		List<Run> list = logRunDao.list(run);
		Integer count = logRunDao.count(run);
		PageUtils<Run> page = new PageUtils<Run>(pageNum, pageSize, count, list);
		return page;
	}

}
