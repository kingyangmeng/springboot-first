package com.weaving.entry.sys.menu;

import java.util.List;

/**
 * 菜单树
 * 
 * @author yang
 *
 */
public class MenuTree extends Menu {

	private List<MenuTree> sonMenu;

	public List<MenuTree> getSonMenu() {
		return sonMenu;
	}

	public void setSonMenu(List<MenuTree> sonMenu) {
		this.sonMenu = sonMenu;
	}

}
