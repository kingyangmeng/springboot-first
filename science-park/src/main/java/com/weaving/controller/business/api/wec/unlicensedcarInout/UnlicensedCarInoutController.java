package com.weaving.controller.business.api.wec.unlicensedcarInout;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weaving.common.ResultObj;

/**
 * 无牌车出入场请求
 * 
 * @author yang
 *
 */
@RestController
@RequestMapping("/api/wec")
@Scope("prototype")
public class UnlicensedCarInoutController {
	
	
	
	@PostMapping("/UnlicensedCarInout")
	public ResultObj unlicensedCarInout() {
		
		
		return null;
	}

}
