package com.weaving.controller.sys.menu;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weaving.common.DefinitionException;
import com.weaving.common.ResultObj;
import com.weaving.controller.business.platform.login.LoginController;
import com.weaving.entry.sys.menu.Menu;
import com.weaving.entry.sys.menu.MenuTree;
import com.weaving.service.sys.menu.MenuServie;

/**
 * 菜单管理
 * 
 * @author yang
 *
 */
@RestController
@RequestMapping("/sys/menu")
@Scope("prototype")
public class MenuController {
	
	private final Logger log= LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private MenuServie menuService;

	/**
	 * 添加菜单
	 * 
	 * @return
	 */
	@PutMapping("add")
	public ResultObj add(Menu menu) {
		try {
			ResultObj result = new ResultObj();
			menuService.addMenu(menu);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/sys/menu/add  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/sys/menu/add  时间： " + new Date() + e.getMessage());
		}
	}

	@GetMapping("list")
	public ResultObj list() {
		try {
			ResultObj result = new ResultObj();
			List<MenuTree> tree = menuService.menuTree();
			result.setData(tree);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/sys/menu/list  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/sys/menu/list  时间： " + new Date() + e.getMessage());
		}
	}

}
