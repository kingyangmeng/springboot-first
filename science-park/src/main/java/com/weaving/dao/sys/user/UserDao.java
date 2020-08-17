package com.weaving.dao.sys.user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.weaving.entry.sys.user.SysUserPark;
import com.weaving.entry.sys.user.User;

@Mapper
public interface UserDao {

	public void addUser(User user)throws Exception;

	public void updateUser(User user)throws Exception;

	public void deleteUser(String id)throws Exception;

	public List<User> getUserList()throws Exception;

	public User queryUser(User user)throws Exception;

	public String queryDeptByUserId(String userId)throws Exception;

	public void addUserPark(SysUserPark user)throws Exception;

	public void forbidden(String id, String userStatus)throws Exception;

}
