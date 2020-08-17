package com.weaving.entry.business.platform.notice;

import java.util.Date;

/**
 * 公告
 * 
 * @author yang
 *
 */
public class Notice {
	private String id;
	private String notice;
	private String createBy;
	private String deptId;
	private Date createDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Notice [id=" + id + ", notice=" + notice + ", createBy=" + createBy + ", deptId=" + deptId
				+ ", createDate=" + createDate + "]";
	}

}
