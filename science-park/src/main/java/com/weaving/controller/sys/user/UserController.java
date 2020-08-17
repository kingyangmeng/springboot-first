package com.weaving.controller.sys.user;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weaving.common.DefinitionException;
import com.weaving.common.ResultObj;
import com.weaving.controller.business.platform.login.LoginController;
import com.weaving.entry.sys.user.User;
import com.weaving.service.sys.user.UserService;

/**
 * 权限用户管理
 * 
 * @author yang
 *
 */
@RestController
@RequestMapping("/sys/user")
@Scope("prototype")
public class UserController {

	private final Logger log = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private UserService userService;

	/**
	 * 添加用户，并且绑定角色
	 * 
	 * @param user
	 * @return
	 */
	@PutMapping("/add")
	public ResultObj add(@Validated User user, HttpServletRequest request) {
		try {
			String token = request.getHeader("X-Token");
			ResultObj result = new ResultObj();
			userService.addUser(token, user);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/sys/user/add  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/sys/user/add  时间： " + new Date() + e.getMessage());
		}
	}

	
	/**
	 * 没有任何作用，测试git
	 * @param id
	 * @return
	 */
	@GetMapping("/get")
	public ResultObj get(String id) {
		ResultObj result = new ResultObj();

		return result;
	}

	/**
	 * 修改用户信息
	 * 
	 * @param user
	 * @return
	 */
	@PutMapping("/update")
	public ResultObj update(@Validated User user) {
		try {
			ResultObj result = new ResultObj();
			userService.updateUser(user);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/sys/user/update  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/sys/user/update  时间： " + new Date() + e.getMessage());
		}
	}

	/**
	 * 删除，不是真的删除
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("/delete")
	public ResultObj delete(String id) {
		try {
			ResultObj result = new ResultObj();
			userService.deleteUser(id);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/sys/user/delete  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/sys/user/delete  时间： " + new Date() + e.getMessage());
		}
	}

	/**
	 * 禁用,解除禁用
	 * 
	 * @param id
	 * @return
	 */
	@PutMapping("/forbidden")
	public ResultObj forbidden(String id, String userStatus) {
		try {
			ResultObj result = new ResultObj();
			userService.forbidden(id, userStatus);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/sys/user/forbidden  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/sys/user/forbidden  时间： " + new Date() + e.getMessage());
		}
	}

	/**
	 * 用户列表
	 * 
	 * @return
	 */
	@GetMapping("/list")
	public ResultObj list() {
		try {
			ResultObj result = new ResultObj();
			List<User> userList = userService.getUserList();
			result.setData(userList);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/sys/user/list  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/sys/user/list  时间： " + new Date() + e.getMessage());
		}
	}

}
