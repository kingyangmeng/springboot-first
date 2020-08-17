package com.weaving.service.sys.menu.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.weaving.common.utils.LevelUtils;
import com.weaving.common.utils.Utils;
import com.weaving.dao.sys.menu.MenuDao;
import com.weaving.entry.sys.menu.Menu;
import com.weaving.entry.sys.menu.MenuTree;
import com.weaving.service.sys.menu.MenuServie;

@Service
@Transactional
public class MenuServiceImpl implements MenuServie {

	@Autowired
	private MenuDao menuDao;
	
	@Override
	public void addMenu(Menu menu) throws Exception {
		// 1.查询出次节点父节点的Level
		String parentLevel = getLevel(menu.getParentId());
		// 2.拼接父节点的id
		String level = LevelUtils.caculateLevel(parentLevel, menu.getParentId());
		menu.setLevel(level);
		menu.setId(Utils.getNumUUID());
		menuDao.add(menu);

	}

	private String getLevel(String id) throws Exception {
		Menu menu = getParentMenu(id);

		if (null == menu) {
			return null;
		} else {
			return menu.getLevel();
		}

	}

	private Menu getParentMenu(String id) throws Exception {
		return menuDao.getMenuById(id);
	}

	@Override
	public List<MenuTree> menuTree() throws Exception{
		
		List<Menu> menuList = menuDao.list();
		// 转化list
		List<MenuTree> source = copyBean(menuList);

		// 组装Tree
		List<MenuTree> tree = getTree(source, "");

		return tree;
	}

	
	@Override
	public List<MenuTree> menuTreeByRole(String roleId) throws Exception{
		
		List<Menu> menuList = menuDao.menulistByRole(roleId);
		// 转化list
		List<MenuTree> source = copyBean(menuList);

		// 组装Tree
		List<MenuTree> tree = getTree(source, "");

		return tree;
	}
	
	/**
	 * 只查询出角色下有的菜单
	 */
	@Override
	public List<MenuTree> menuTreeByRoleId(String roleId) throws Exception{
		
		List<Menu> menuList = menuDao.menulistByRoleId(roleId);
		// 转化list
		List<MenuTree> source = copyBean(menuList);

		// 组装Tree
		List<MenuTree> tree = getTree(source, "");

		return tree;
	}
	
	/**
	 * 将原始List 转化为 TreeList
	 * 
	 * @param menuList
	 * @return
	 */
	private List<MenuTree> copyBean(List<Menu> menuList) throws Exception{
		List<MenuTree> treeList = new ArrayList<MenuTree>();
		for (Menu menuEntry : menuList) {
			MenuTree tree = new MenuTree();
			BeanUtils.copyProperties(menuEntry, tree);
			treeList.add(tree);
		}
		return treeList;
	}
	
	
	private List<MenuTree> getTree(List<MenuTree> source, String parentId) throws Exception{
		List<MenuTree> childMenu = childMenu(source, parentId);
		for (MenuTree menuTree : childMenu) {
			menuTree.setSonMenu(getTree(source, menuTree.getId()));
		}
		return childMenu;
	}
	
	/**
	 * 查询出父元素的子元素
	 * 
	 * @param source
	 * @param parentId
	 * @return
	 */
	private List<MenuTree> childMenu(List<MenuTree> source, String parentId) throws Exception{
		List<MenuTree> childMenu = new ArrayList<MenuTree>();
		for (MenuTree menuTree : source) {
			if (menuTree.getParentId().equals(parentId)) {
				childMenu.add(menuTree);
			}
		}
		return childMenu;
	}

	

}
