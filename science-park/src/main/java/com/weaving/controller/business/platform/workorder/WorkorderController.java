package com.weaving.controller.business.platform.workorder;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

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
import com.weaving.entry.business.platform.workorder.Workorder;
import com.weaving.service.business.platform.workorder.WorkorderService;

/**
 * 工单管理
 * 
 * @author yang
 *
 */
@RestController
@RequestMapping("/platform/workorder")
@Scope("prototype")
public class WorkorderController {
	
	private final Logger log= LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private WorkorderService workorderService;

	/**
	 * 创建工单
	 * 
	 * @return
	 */
	@PutMapping("/create")
	public ResultObj create(Workorder order, HttpServletRequest request) {
		try {
			ResultObj result = new ResultObj();
			String token = request.getHeader("X-Token");
			workorderService.add(token, order);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/platform/workorder/create  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/platform/workorder/create  时间： " + new Date() + e.getMessage());
		}
	}

	/**
	 * 工单列表
	 * 
	 * @param order
	 * @return
	 */
	@GetMapping("/list")
	public ResultObj list(Workorder order, @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
		try {
			ResultObj result = new ResultObj();
			PageUtils<Workorder> list = workorderService.list(order, pageNum, pageSize);
			result.setData(list);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/platform/workorder/list  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/platform/workorder/list  时间： " + new Date() + e.getMessage());
		}
	}

}
