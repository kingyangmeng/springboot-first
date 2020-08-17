package com.weaving.controller.business.platform.access;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weaving.common.ResultObj;

/**
 * 车辆通行记录
 * 
 * @author yang
 *
 */

@RestController
@RequestMapping("/platform/access")
@Scope("prototype")
public class AccessController {

	
	private final Logger log= LoggerFactory.getLogger(AccessController.class);
	/**
	 * 车辆进出记录
	 * 
	 * @return
	 */
	@GetMapping("/list")
	public ResultObj list(@RequestBody String body) {
		log.info("==============");
		return null;
	}

}
