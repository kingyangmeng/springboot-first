package com.weaving.service.sys.dept;

import java.util.List;

import com.weaving.entry.sys.dept.Dept;
import com.weaving.entry.sys.dept.DeptTree;
import com.weaving.entry.sys.dept.SysDeptUser;

public interface DeptService {

	void addDept(Dept dept) throws Exception;

	List<DeptTree> getDeptTree()throws Exception;

	void updateDept(Dept dept)throws Exception;

	void deptBindUser(SysDeptUser deptUser)throws Exception;

	void cancleBindUser(SysDeptUser deptUser)throws Exception;

}
