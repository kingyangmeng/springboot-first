package com.weaving.entry.sys.dept;

import java.util.List;

import org.springframework.beans.BeanUtils;

public class DeptTree extends Dept{
	private List<DeptTree> deptTree;

	public static DeptTree copy(Dept dept) {
		DeptTree deptTree = new DeptTree();
		BeanUtils.copyProperties(dept, deptTree);
		return deptTree;
	}

	public List<DeptTree> getDeptTree() {
		return deptTree;
	}

	public void setDeptTree(List<DeptTree> deptTree) {
		this.deptTree = deptTree;
	}
	
	
	
}
