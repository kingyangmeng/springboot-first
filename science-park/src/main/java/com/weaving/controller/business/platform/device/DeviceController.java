package com.weaving.controller.business.platform.device;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weaving.common.DefinitionException;
import com.weaving.common.PageUtils;
import com.weaving.common.ResultObj;
import com.weaving.controller.business.platform.login.LoginController;
import com.weaving.entry.business.platform.device.Device;
import com.weaving.service.business.platform.device.DeviceService;

/**
 * 设备管理
 * 
 * @author yang
 *
 */
@RestController
@RequestMapping("/platform/device")
@Scope("prototype")
public class DeviceController {
	
	private final Logger log= LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private DeviceService deviceService;

	@GetMapping("/list")
	public ResultObj list(Device device, @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
		try {
			ResultObj result = new ResultObj();
			PageUtils<Device> list = deviceService.list(device, pageNum, pageSize);
			result.setData(list);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/platform/device/list  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/platform/device/list  时间： " + new Date() + e.getMessage());
		}
	}

//	@PutMapping("/add")
//	public ResultObj add(Device device, HttpServletRequest request) {
//		try {
//			ResultObj result = new ResultObj();
//			String token = request.getHeader("X-Token");
//			deviceService.add(token, device);
//			return result;
//		} catch (Exception e) {
//			log.info("==>系统异常：/platform/device/add  时间： " + new Date() + e.getMessage());
//			throw new DefinitionException("系统异常：/platform/device/add  时间： " + new Date() + e.getMessage());
//		}
//	}

}
