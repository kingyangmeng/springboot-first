package com.weaving.controller.business.app.owner.login;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weaving.common.ResultObj;

/**
 * 车主端登录
 * 
 * @author yang
 *
 */

@RestController
@RequestMapping("/business/app/owner")
@Scope("prototype")
public class OwnerLoginController {

	@PostMapping("/login")
	public ResultObj login() {

		return null;
	}

}
