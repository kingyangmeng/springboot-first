package com.weaving.entry.sys.role;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import com.weaving.entry.sys.comm.Comm;

/**
 * 角色
 * 
 * @author yang
 *
 */
public class Role extends Comm {
	private String id;
	private String roleCode;// 角色编码
	private String roleName;// 角色名称
	private String dataLine;// 数据范围 0 仅本人 1 所在部门及以下
	@Size(max = 80,message = "备注的字数限制在80个以内")
	private String remark; // 备注（描述）

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getDataLine() {
		return dataLine;
	}

	public void setDataLine(String dataLine) {
		this.dataLine = dataLine;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", roleCode=" + roleCode + ", roleName=" + roleName + ", dataLine=" + dataLine
				+ ", remark=" + remark + "]";
	}

}
