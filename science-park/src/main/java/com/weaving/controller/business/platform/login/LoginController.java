package com.weaving.controller.business.platform.login;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weaving.common.DefinitionException;
import com.weaving.common.ResultObj;
import com.weaving.entry.sys.menu.MenuTree;
import com.weaving.entry.sys.user.User;
import com.weaving.service.business.platform.login.LoginService;
import com.weaving.service.sys.user.UserService;

/**
 * 平台用户登录
 * 
 * @author yang
 *
 */
@RestController
@RequestMapping("/platform")
@Scope("prototype")
@Validated
public class LoginController {
	
	private final Logger log= LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private LoginService loginService;

	@Autowired
	private UserService userService;

	/**
	 * 登录
	 * 
	 * @param user
	 * @return
	 * @throws DefinitionException
	 */
	@PostMapping("/login")
	public ResultObj login(@Validated User user) throws DefinitionException {
		try {
			ResultObj result = new ResultObj();
			User paltformUser = loginService.login(user);
			if (null != paltformUser) {
				result.setData(paltformUser);
			} else {
				result.setCode(201);
				result.setMessage("用户名或密码错误");
				result.setStatus(false);
			}
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/platform/login  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/platform/login  时间： " + new Date() + e.getMessage());
		}
	}

	/**
	 * 另外一种参数校验示例
	 * 
	 * @param username
	 * @return
	 */
	@GetMapping("/hello")
	public ResultObj hello(@NotNull(message = "用户名不能为空") String username) {
		ResultObj result = new ResultObj();
		return result;
	}

	/**
	 * 退出
	 * 
	 * @param user
	 * @return
	 * @throws DefinitionException
	 */
	@PostMapping("/logout")
	public ResultObj logout(HttpServletRequest request) throws DefinitionException {
		try {
			ResultObj result = new ResultObj();
			String token = request.getHeader("X-Token");
			loginService.logout(token);
			result.setData(token);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/platform/logout  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/platform/logout  时间： " + new Date() + e.getMessage());
		}
	}

	/**
	 * 登录以后加载用户权限菜单
	 * 
	 * @param request
	 * @return
	 * @throws Exception 
	 */
	@GetMapping("/menuTree")
	public ResultObj menuTree(HttpServletRequest request) throws Exception {
		try {
			String token = request.getHeader("X-Token");
			ResultObj result = new ResultObj();
			List<MenuTree> tree = userService.getMenuTree(token);
			result.setData(tree);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/platform/menuTree  时间： " + new Date() + e.getMessage());
			throw new Exception("系统异常：/platform/menuTree  时间： " + new Date() + e.getMessage());
		}
	}

}
