package com.weaving.entry.sys.menu;

import javax.validation.constraints.Size;

/**
 * 菜单
 * 
 * @author yang
 *
 */
public class Menu {
	private String id;
	private String name;
	private String parentId;
	private String level;// 等级
	private String code;// 编码
	private String url;
	private String type;// 1: 连接 2 ：按钮
	private String seq;// 顺序
	@Size(max = 80,message = "备注的字数限制在80个以内")
	private String remark;// 备注
	private String roleId; // 角色id

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", name=" + name + ", parentId=" + parentId + ", level=" + level + ", code=" + code
				+ ", url=" + url + ", type=" + type + ", seq=" + seq + ", remark=" + remark + ", roleId=" + roleId
				+ "]";
	}

}
