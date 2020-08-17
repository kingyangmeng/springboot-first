package com.weaving.service.sys.user;

import java.util.List;

import com.weaving.entry.sys.menu.MenuTree;
import com.weaving.entry.sys.user.User;

public interface UserService {

	void addUser(String token, User user)throws Exception;

	void updateUser(User user)throws Exception;

	void deleteUser(String id)throws Exception;

	List<User> getUserList()throws Exception;

	List<MenuTree> getMenuTree(String token) throws Exception;

	void forbidden(String id, String userStatus)throws Exception;

}
