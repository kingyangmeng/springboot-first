package com.weaving.dao.sys.dept;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.weaving.entry.sys.dept.Dept;
import com.weaving.entry.sys.dept.SysDeptUser;

@Mapper
public interface DeptDao {

	void addDept(Dept dept)throws Exception;

	Dept getDeptById(String id)throws Exception;

	List<Dept> getList()throws Exception;

	void updateDept(Dept dept)throws Exception;

	void deptBindUser(SysDeptUser deptUser)throws Exception;

	void cancleBindUser(SysDeptUser deptUser)throws Exception;

}
