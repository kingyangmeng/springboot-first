package com.weaving.service.business.platform.blacklist.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.weaving.common.PageUtils;
import com.weaving.common.RedisUtils;
import com.weaving.common.utils.Utils;
import com.weaving.dao.business.platform.blacklist.BlacklistDao;
import com.weaving.entry.business.platform.blacklist.Blacklist;
import com.weaving.entry.sys.user.User;
import com.weaving.service.business.platform.blacklist.BlacklistService;

@Service
@Transactional
public class BlacklistServiceimpl implements BlacklistService {

	@Autowired
	private RedisUtils redisUtils;

	@Autowired
	private BlacklistDao blacklistDao;

	@Override
	public void add(String token, Blacklist blacklist) throws Exception{
		User user = (User) redisUtils.get(token);
		blacklist.setCreateBy(user.getId());
		blacklist.setDeptId(user.getDeptId());
		blacklist.setCreateDate(new Date());
		blacklist.setId(Utils.getNumUUID());
		blacklistDao.add(blacklist);
	}

	@Override
	public PageUtils<Blacklist> listPage(Blacklist blacklist, Integer pageNum, Integer pageSize) throws Exception{

		Integer index = pageSize * (pageNum - 1);
		Integer num = pageSize;
		
		blacklist.setIndex(index);
		blacklist.setNum(num);
		
		List<Blacklist> list = blacklistDao.list(blacklist);
		Integer count = blacklistDao.count(blacklist);
		PageUtils<Blacklist> page = new PageUtils<>(pageNum, pageSize, count, list);
		return page;
	}

	@Override
	public void delete(String id) throws Exception{
		blacklistDao.delete(id);
	}

}
