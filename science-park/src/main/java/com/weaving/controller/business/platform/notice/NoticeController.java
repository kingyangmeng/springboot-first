package com.weaving.controller.business.platform.notice;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weaving.common.DefinitionException;
import com.weaving.common.ResultObj;
import com.weaving.controller.business.platform.login.LoginController;
import com.weaving.entry.business.platform.notice.Notice;
import com.weaving.service.business.platform.notice.NoticeService;

/**
 * 公告管理
 * 
 * @return
 */
@RestController
@RequestMapping("/platform/notice")
@Scope("prototype")
public class NoticeController {
	
	private final Logger log= LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private NoticeService noticeService;
	

	@PutMapping("/add")
	public ResultObj add(Notice notice) {
		try {
			ResultObj result = new ResultObj();
			noticeService.add(notice);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/platform/notice/add  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/platform/notice/add  时间： " + new Date() + e.getMessage());
		}
	}

}
