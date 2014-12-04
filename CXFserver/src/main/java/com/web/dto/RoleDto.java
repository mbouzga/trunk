package com.web.dto;

import java.io.Serializable;

public class RoleDto implements Serializable{

	private static final long serialVersionUID = -7757973089462528969L;
	
	private Integer roleId;
	private String roleName;
	
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


}
