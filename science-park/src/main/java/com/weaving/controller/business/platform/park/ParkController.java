package com.weaving.controller.business.platform.park;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weaving.common.DefinitionException;
import com.weaving.common.PageUtils;
import com.weaving.common.ResultObj;
import com.weaving.controller.business.platform.login.LoginController;
import com.weaving.entry.business.platform.park.Park;
import com.weaving.service.business.platform.park.ParkService;

/**
 * 停车场管理（配置）
 * 
 * @author yang
 *
 */
@RestController
@RequestMapping("/platform/park")
@Scope("prototype")
@Validated
public class ParkController {

	private final Logger log = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private ParkService parkService;

	/**
	 * 
	 * @param park
	 * @param pageNum  页码
	 * @param pageSize 每页条数
	 * @return
	 */
	@GetMapping("/list")
	public ResultObj list(Park park, @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
		try {
			ResultObj result = new ResultObj();
			PageUtils<Park> list = parkService.list(park, pageNum, pageSize);
			result.setData(list);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/platform/park/list  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/platform/park/list  时间： " + new Date() + e.getMessage());
		}
	}

	/**
	 * 获取车场信息
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/get")
	@Validated
	public ResultObj getInfo(@NotNull(message = "id不能为空") String id) {
		try {
			ResultObj result = new ResultObj();
			Park park = parkService.getParkInfoById(id);
			result.setData(park);
			return result;
		} catch (Exception e) {
			throw new DefinitionException("系统异常：/platform/park/get  时间： " + new Date());
		}
	}

	/**
	 * 添加车场信息
	 * 
	 * @param park
	 * @return
	 */
	@PutMapping("/add")
	public ResultObj add(Park park, HttpServletRequest request) {
		try {
			ResultObj result = new ResultObj();
			String token = request.getHeader("X-Token");
			parkService.add(token, park);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/platform/park/add  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/platform/park/add  时间： " + new Date() );
		}
	}

	/**
	 * 更新车场信息和活动规则
	 * 
	 * @param park
	 * @return
	 */
	@PutMapping("/update")
	public ResultObj update(Park park) {
		try {
			ResultObj result = new ResultObj();
			parkService.update(park);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/platform/park/update  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/platform/park/update  时间： " + new Date());
		}
	}

	/**
	 * 和第三系统同步信息
	 * 
	 * @param parkId 车场Id，第三方提供
	 * @return
	 */
	@PutMapping("/sync")
	public ResultObj sync(String parkId) {
		try {
			ResultObj result = new ResultObj();
			parkService.sync(parkId);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/platform/park/sync  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/platform/park/sync  时间： " + new Date() + e.getMessage());
		}

	}

}
