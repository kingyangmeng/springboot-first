package com.weaving.controller.business.platform.log.run;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weaving.common.DefinitionException;
import com.weaving.common.PageUtils;
import com.weaving.common.ResultObj;
import com.weaving.controller.business.platform.login.LoginController;
import com.weaving.entry.business.platform.log.run.Run;
import com.weaving.service.business.platform.log.run.LogRunService;

/**
 * 系统运行日志
 * 
 * @author yang
 *
 */

@RestController
@RequestMapping("/platform/log/run")
@Scope("prototype")
public class LogRunController {
	
	private final Logger log= LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private LogRunService logRunService;

	@PutMapping("/add")
	public ResultObj add(Run run) {
		try {
			ResultObj result = new ResultObj();
			logRunService.add(run);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/platform/log/run/add  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/platform/log/run/add  时间： " + new Date() + e.getMessage());
		}
	}

	@GetMapping("/list")
	public ResultObj list(Run run, @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
		try {
			ResultObj result = new ResultObj();
			PageUtils<Run> page = logRunService.list(run, pageNum, pageSize);
			result.setData(page);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/platform/log/run/list  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/platform/log/run/list  时间： " + new Date() + e.getMessage());
		}

	}
}
