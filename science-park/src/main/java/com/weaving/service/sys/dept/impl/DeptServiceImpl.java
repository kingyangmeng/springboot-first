package com.weaving.service.sys.dept.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.weaving.common.utils.LevelUtils;
import com.weaving.common.utils.Utils;
import com.weaving.dao.sys.dept.DeptDao;
import com.weaving.entry.sys.dept.Dept;
import com.weaving.entry.sys.dept.DeptTree;
import com.weaving.entry.sys.dept.SysDeptUser;
import com.weaving.service.sys.dept.DeptService;

@Service
@Transactional
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptDao;

	@Override
	public void addDept(Dept dept) throws Exception {
		String level = LevelUtils.caculateLevel(getLevel(dept.getParentId()), dept.getParentId());
		dept.setId(Utils.getNumUUID());
		dept.setLevel(level);
		dept.setCreateDate(new Date());
		dept.setCreateBy("System");
		deptDao.addDept(dept);
	}

	private String getLevel(String id) throws Exception {
		Dept dept = deptDao.getDeptById(id);
		if (null == dept) {
			return null;
		} else {
			return dept.getLevel();
		}

	}

	@Override
	public List<DeptTree> getDeptTree() throws Exception{
		List<Dept> deptList = deptDao.getList();

		// 获取到没有组装的list
		List<DeptTree> sourceTree = copyDeptList(deptList);

		List<DeptTree> tree = getTree(sourceTree, "");

		return tree;
	}

	public List<DeptTree> getTree(List<DeptTree> list, String parentId) {
		// 获取到的子节点List
		List<DeptTree> childTree = getChildTree(list, parentId);
		for (DeptTree deptTree : childTree) {
			deptTree.setDeptTree(getTree(list, deptTree.getId()));
		}
		return childTree;
	}

	/**
	 * 根据父节点，找到所有的子节点
	 * 
	 * @return
	 */
	public List<DeptTree> getChildTree(List<DeptTree> list, String parentId) {
		List<DeptTree> childTree = new ArrayList<DeptTree>();
		for (DeptTree deptTree : list) {
			if (parentId.equals(deptTree.getParentId())) {
				childTree.add(deptTree);
			}
		}
		return childTree;
	}

	/**
	 * 
	 * copyBean
	 * 
	 * @param deptList
	 * @return
	 */
	private List<DeptTree> copyDeptList(List<Dept> deptList) {
		List<DeptTree> sourcetree = new ArrayList<DeptTree>();
		for (Dept deptEntry : deptList) {
			DeptTree deptTree = DeptTree.copy(deptEntry);
			sourcetree.add(deptTree);
		}
		return sourcetree;
	}

	@Override
	public void updateDept(Dept dept) throws Exception{
		deptDao.updateDept(dept);
	}

	@Override
	public void deptBindUser(SysDeptUser deptUser) throws Exception{
		deptUser.setId(Utils.getNumUUID());
		deptDao.deptBindUser(deptUser);
	}

	@Override
	public void cancleBindUser(SysDeptUser deptUser) throws Exception{
		deptDao.cancleBindUser(deptUser);
	}
}
