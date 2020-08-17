package com.weaving.controller.business.platform.log.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weaving.common.PageUtils;
import com.weaving.common.ResultObj;
import com.weaving.entry.business.platform.log.exception.Exception;
import com.weaving.service.business.platform.log.exception.LogExceptionService;

/**
 * 系统异常日志
 * 
 * @author yang
 *
 */
@RestController
@RequestMapping("/platform/log/exception")
@Scope("prototype")
public class LogExceptionController {

	@Autowired
	private LogExceptionService logExceptionService;

	@PutMapping("/add")
	public ResultObj add(Exception exception) {
		ResultObj result = new ResultObj();
		logExceptionService.add(exception);
		return result;
	}

	@GetMapping("/list")
	public ResultObj list(Exception exception, @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
		ResultObj result = new ResultObj();
		PageUtils<Exception> page = logExceptionService.list(exception, pageNum, pageSize);

		result.setData(page);
		return result;
	}

}
