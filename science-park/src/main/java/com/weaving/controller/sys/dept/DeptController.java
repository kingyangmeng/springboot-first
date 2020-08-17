package com.weaving.controller.sys.dept;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weaving.common.DefinitionException;
import com.weaving.common.ResultObj;
import com.weaving.controller.business.platform.login.LoginController;
import com.weaving.entry.sys.dept.Dept;
import com.weaving.entry.sys.dept.DeptTree;
import com.weaving.entry.sys.dept.SysDeptUser;
import com.weaving.service.sys.dept.DeptService;

/**
 * 部门管理
 * 
 * @author yang
 *
 */
@RestController
@RequestMapping("/sys/dept")
@Scope("prototype")
public class DeptController {
	
	private final Logger log= LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private DeptService deptService;

	/**
	 * 添加部门
	 * 
	 * @param dept
	 * @return
	 */
	@PutMapping("/add")
	public ResultObj add(Dept dept) {
		try {
			ResultObj result = new ResultObj();
			deptService.addDept(dept);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/sys/dept/add  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/sys/dept/add  时间： " + new Date() + e.getMessage());
		}
	}

	/**
	 * 修改部门
	 * 
	 * @param dept
	 * @return
	 */
	@PutMapping("/update")
	public ResultObj update(Dept dept) {
		try {
			ResultObj result = new ResultObj();
			deptService.updateDept(dept);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/sys/dept/update  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/sys/dept/update  时间： " + new Date() + e.getMessage());
		}
	}

	/**
	 * 查询部门树
	 * 
	 * @return
	 */
	@GetMapping("/list")
	public ResultObj list() {
		try {
			ResultObj result = new ResultObj();
			List<DeptTree> deptList = deptService.getDeptTree();
			result.setData(deptList);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/sys/dept/list  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/sys/dept/list  时间： " + new Date() + e.getMessage());
		}
	}

	/**
	 * 用户绑定部门
	 * 
	 * @param deptUser
	 * @return
	 */
	@PutMapping("/deptBindUser")
	public ResultObj deptBindUser(SysDeptUser deptUser) {
		try {
			ResultObj result = new ResultObj();
			deptService.deptBindUser(deptUser);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/sys/dept/deptBindUser  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/sys/dept/deptBindUser  时间： " + new Date() + e.getMessage());
		}
	}

	/**
	 * 部门用户解除绑定
	 * 
	 * @param deptUser
	 * @return
	 */
	@PutMapping("/cancleBindUser")
	public ResultObj cancleBindUser(SysDeptUser deptUser) {
		try {
			ResultObj result = new ResultObj();
			deptService.cancleBindUser(deptUser);
			return result;
		} catch (Exception e) {
			log.info("==>系统异常：/sys/dept/cancleBindUser  时间： " + new Date() + e.getMessage());
			throw new DefinitionException("系统异常：/sys/dept/cancleBindUser  时间： " + new Date() + e.getMessage());
		}
	}

}
