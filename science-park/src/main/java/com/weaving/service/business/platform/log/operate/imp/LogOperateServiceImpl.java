package com.weaving.service.business.platform.log.operate.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.weaving.common.PageUtils;
import com.weaving.common.utils.Utils;
import com.weaving.dao.business.platform.log.operate.LogOperateDao;
import com.weaving.entry.business.platform.log.operate.Operate;
import com.weaving.service.business.platform.log.operate.LogOperateService;

@Service
@Transactional
public class LogOperateServiceImpl implements LogOperateService {

	@Autowired
	private LogOperateDao logOperateDao;

	@Override
	public void add(Operate operate) throws Exception{
		operate.setId(Utils.getNumUUID());
		logOperateDao.add(operate);
	}

	@Override
	public PageUtils<Operate> list(Operate operate, Integer pageNum, Integer pageSize)throws Exception {
		Integer index = pageSize * (pageNum - 1);
		Integer num = pageSize;

		operate.setIndex(index);
		operate.setNum(num);

		List<Operate> list = logOperateDao.list(operate);
		Integer count = logOperateDao.count(operate);
		PageUtils<Operate> page = new PageUtils<Operate>(pageNum, pageSize, count, list);
		return page;
	}

}
