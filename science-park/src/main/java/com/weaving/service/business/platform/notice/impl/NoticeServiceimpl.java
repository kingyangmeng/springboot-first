package com.weaving.service.business.platform.notice.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.weaving.common.utils.Utils;
import com.weaving.dao.business.platform.notice.NoticeDao;
import com.weaving.entry.business.platform.notice.Notice;
import com.weaving.service.business.platform.notice.NoticeService;

@Service
@Transactional
public class NoticeServiceimpl implements NoticeService {

	@Autowired
	private NoticeDao noticeDao;

	@Override
	public void add(Notice notice) throws Exception{
		notice.setId(Utils.getNumUUID());
		notice.setCreateDate(new Date());
		noticeDao.add(notice);
	}

}
