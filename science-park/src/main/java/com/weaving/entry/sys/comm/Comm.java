package com.weaving.entry.sys.comm;

import java.util.Date;

/**
 * 公共属性
 * 
 * @author yang
 *
 */
public class Comm extends Page {

	private Date createDate = new Date(); // 创建时间
	private String createBy; // 创建者id
	private String deptId;
	private Date startDate;
	private Date endDate;

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Comm [createDate=" + createDate + ", createBy=" + createBy + ", deptId=" + deptId + "]";
	}

}
