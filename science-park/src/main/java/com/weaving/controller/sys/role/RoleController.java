package com.weaving.controller.sys.role;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weaving.common.DefinitionException;
import com.weaving.common.ResultObj;
import com.weaving.controller.business.platform.login.LoginController;
import com.weaving.entry.sys.menu.MenuTree;
import com.weaving.entry.sys.role.Role;
import com.weaving.entry.sys.role.RoleUserMenuParam;
import com.weaving.entry.sys.role.RoleUserResult;
import com.weaving.entry.sys.user.User;
import com.weaving.service.sys.role.RoleService;

/**
 * 角色管理
 * 
 * @author yang
 *
 */

@RestController
@RequestMapping("/sys/role")
@Scope("prototype")
public class RoleController {
	
	private final Logger log= LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private RoleService roleService;

	/**
	 * 添加角色
	 * 
	 * @param role
	 * @return
	 */
	@PutMapping("/add")
	public ResultObj add(@Validated Role role) {
		try {
			ResultObj result = new ResultObj();
			roleService.addRole(role);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/sys/role/add  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/sys/role/add  时间： " + new Date() + e.getMessage());
		}
	}

	/**
	 * 角色列表
	 * 
	 * @param role
	 * @return
	 */
	@GetMapping("/list")
	public ResultObj list(Role role) {
		try {
			ResultObj result = new ResultObj();
			List<Role> roleList = roleService.getAllRole(role);
			result.setData(roleList);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/sys/role/list  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/sys/role/list  时间： " + new Date() + e.getMessage());
		}
	}

	/**
	 * 查询所有运营主管: paltformOperate
	 * 
	 * @param roleCode
	 * @return
	 */
	@GetMapping("/operation")
	public ResultObj operation(String roleCode) {
		try {
			ResultObj result = new ResultObj();
			List<User> userList = roleService.getOperation(roleCode);
			result.setData(userList);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/sys/role/operation  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/sys/role/operation  时间： " + new Date() + e.getMessage());
		}

	}

	/**
	 * 用户绑定角色
	 * 
	 * @param userId
	 * @param roleId
	 * @return
	 */
	@PutMapping("/userBindRole")
	public ResultObj userBindRole(RoleUserMenuParam param) {
		try {
			ResultObj result = new ResultObj();
			roleService.userBindRole(param);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/sys/role/userBindRole  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/sys/role/userBindRole  时间： " + new Date() + e.getMessage());
		}
	}

	/**
	 * 取消角色绑定用户
	 * 
	 * @param param
	 * @return
	 */
	@PutMapping("/cancleBindUser")
	public ResultObj cancleBindUser(RoleUserMenuParam param) {
		try {
			ResultObj result = new ResultObj();
			roleService.cancleBindUser(param);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/sys/role/cancleBindUser  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/sys/role/cancleBindUser  时间： " + new Date() + e.getMessage());
		}
	}

	/**
	 * 根据RoleId查询用户列表,带出当前角色
	 * 
	 * @param roleId
	 * @param realname
	 * @return
	 */
	@GetMapping("/user")
	public ResultObj user(String roleId, String realname) {
		try {
			ResultObj result = new ResultObj();
			List<RoleUserResult> userList = roleService.getUserListByRole(roleId, realname);
			result.setData(userList);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/sys/role/user  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/sys/role/user  时间： " + new Date() + e.getMessage());
		}
	}

	/**
	 * 角色绑定菜单
	 * 
	 * @return
	 */
	@PutMapping("/menuBindRole")
	public ResultObj menuBindRole(RoleUserMenuParam roleMenu) {
		try {
			ResultObj result = new ResultObj();
			roleService.menuBindRole(roleMenu);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/sys/role/menuBindRole  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/sys/role/menuBindRole  时间： " + new Date() + e.getMessage());
		}
	}

	/**
	 * 角色菜单解除绑定
	 * 
	 * @param param
	 * @return
	 */
	@PutMapping("cancleBindMenu")
	public ResultObj cancleBindMenu(RoleUserMenuParam param) {
		try {
			ResultObj result = new ResultObj();
			roleService.cancleBindMenu(param);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/sys/role/cancleBindMenu  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/sys/role/cancleBindMenu  时间： " + new Date() + e.getMessage());
		}
	}

	/**
	 * 根据roleId查询菜单
	 * 
	 * @param roleId
	 * @return
	 */
	@GetMapping("/menu")
	public ResultObj menu(String roleId) {
		try {
			ResultObj result = new ResultObj();
			List<MenuTree> tree = roleService.getMenuTreeByRole(roleId);
			result.setData(tree);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/sys/role/menu  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/sys/role/menu  时间： " + new Date() + e.getMessage());
		}

	}

}
