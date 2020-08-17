package com.weaving.entry.sys.dept;

import java.util.Date;

import javax.validation.constraints.Size;

public class Dept {

	private String id;
	private String name;
	private String parentId;
	private String level;// 等级
	private String seq;// 顺序
	@Size(max = 80,message = "备注的字数限制在80个以内")
	private String remark;
	private String createBy;
	private Date createDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", parentId=" + parentId + ", level=" + level + ", seq=" + seq
				+ ", remark=" + remark + ", createBy=" + createBy + ", createDate=" + createDate + "]";
	}

}
