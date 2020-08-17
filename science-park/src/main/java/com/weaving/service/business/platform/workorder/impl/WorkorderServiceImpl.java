package com.weaving.service.business.platform.workorder.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.weaving.common.PageUtils;
import com.weaving.common.RedisUtils;
import com.weaving.common.utils.Utils;
import com.weaving.dao.business.platform.workorder.WorkorderDao;
import com.weaving.entry.business.platform.workorder.Workorder;
import com.weaving.entry.sys.user.User;
import com.weaving.service.business.platform.workorder.WorkorderService;

@Service
@Transactional
public class WorkorderServiceImpl implements WorkorderService {

	@Autowired
	private RedisUtils redisUtils;

	@Autowired
	private WorkorderDao workorderDao;

	@Override
	public void add(String token, Workorder order) throws Exception{
		// 查询出当前登录用户
		User loginUser = (User) redisUtils.get(token);
		order.setId(Utils.getNumUUID());
		order.setCreateBy(loginUser.getId());
		order.setCreateDate(new Date());
		order.setDeptId(loginUser.getDeptId());
		order.setRoderStatus("1");
		workorderDao.add(order);
	}

	@Override
	public PageUtils<Workorder> list(Workorder order, Integer pageNum, Integer pageSize) throws Exception{
		Integer index = pageSize * (pageNum - 1);
		Integer num = pageSize;

		order.setIndex(index);
		order.setNum(num);

		List<Workorder> list = workorderDao.list(order);
		Integer count = workorderDao.count(order);
		PageUtils<Workorder> page = new PageUtils<Workorder>(pageNum, pageSize, count, list);
		return page;
	}

}
