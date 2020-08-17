package com.weaving.dao.sys.role;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.weaving.entry.sys.role.Role;
import com.weaving.entry.sys.role.RoleUserResult;
import com.weaving.entry.sys.role.SysRoleMenu;
import com.weaving.entry.sys.role.SysRoleUser;
import com.weaving.entry.sys.user.User;

@Mapper
public interface RoleDao {

	void addRole(Role role)throws Exception;

	List<Role> getAllRole()throws Exception;

	void userBindRole(SysRoleUser roleUser)throws Exception;
	
	void cancleBindUser(SysRoleUser roleUser)throws Exception;
	
	List<RoleUserResult> getUserListByRole(String roleId,String realname)throws Exception;

	void meunBindRole(SysRoleMenu roleMenus)throws Exception;
	
	void cancleBindMenu(SysRoleMenu roleMenus)throws Exception;
	
	Role getRoleByUserId(String userId)throws Exception;

	List<User> getOperation(String roleCode)throws Exception;

	void deleteRoleUser(String id)throws Exception;
	
	Role getRoleById(String id);


}
