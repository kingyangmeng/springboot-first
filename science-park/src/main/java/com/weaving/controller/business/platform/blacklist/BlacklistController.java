package com.weaving.controller.business.platform.blacklist;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weaving.common.DefinitionException;
import com.weaving.common.PageUtils;
import com.weaving.common.ResultObj;
import com.weaving.controller.business.platform.login.LoginController;
import com.weaving.entry.business.platform.blacklist.Blacklist;
import com.weaving.service.business.platform.blacklist.BlacklistService;

/**
 * 黑名单
 * 
 * @return
 */
@RestController
@RequestMapping("/platform/operate/blacklist")
@Scope("prototype")
public class BlacklistController {
	
	private final Logger log= LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private BlacklistService blacklistService;

	/**
	 * 添加黑名单
	 * 
	 * @param blackList
	 * @return
	 */
	@PutMapping("/add")
	public ResultObj add(Blacklist blacklist, HttpServletRequest request) {
		try {
			String token = request.getHeader("X-Token");
			ResultObj result = new ResultObj();
			blacklistService.add(token, blacklist);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/platform/operate/blacklist/add  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/platform/operate/blacklist/add  时间： " + new Date() + e.getMessage());
		}
	}

	/**
	 * 查询列表
	 * 
	 * @param blacklist
	 * @param pageNum   页码
	 * @param pageSize  每页条数
	 * @return
	 */
	@GetMapping("/list")
	public ResultObj list(Blacklist blacklist,  @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
		try {
			ResultObj result = new ResultObj();
			PageUtils<Blacklist> list = blacklistService.listPage(blacklist, pageNum, pageSize);
			result.setData(list);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/platform/operate/blacklist/list  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/platform/operate/blacklist/list  时间： " + new Date() + e.getMessage());
		}
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@DeleteMapping("/delete")
	public ResultObj delete(String id) {
		try {
			ResultObj result = new ResultObj();
			blacklistService.delete(id);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/platform/operate/blacklist/delete  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/platform/operate/blacklist/delete  时间： " + new Date() + e.getMessage());
		}
	}

}
