package com.weaving.dao.sys.menu;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.weaving.entry.sys.menu.Menu;

@Mapper
public interface MenuDao {

	void add(Menu menu)throws Exception;

	Menu getMenuById(String id)throws Exception;

	List<Menu> list()throws Exception;

	List<Menu> menulistByRole(String roleId)throws Exception;

	List<Menu> menulistByRoleId(String roleId)throws Exception;
}
