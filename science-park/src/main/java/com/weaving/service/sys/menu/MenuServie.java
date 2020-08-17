package com.weaving.service.sys.menu;

import java.util.List;

import com.weaving.entry.sys.menu.Menu;
import com.weaving.entry.sys.menu.MenuTree;

public interface MenuServie {

	void addMenu(Menu menu) throws Exception;

	List<MenuTree> menuTree()throws Exception;

	/**
	 * 查询出带角色的菜单树
	 * @param roleId
	 * @return
	 */
	List<MenuTree> menuTreeByRole(String roleId)throws Exception;
	
	/**
	 * 只查询出角色下有的菜单
	 * @param roleId
	 * @return
	 */
	List<MenuTree> menuTreeByRoleId(String roleId)throws Exception;
}
