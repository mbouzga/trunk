package com.web.dto;

import java.io.Serializable;
import java.util.List;

public class UserDto implements Serializable{

	private static final long serialVersionUID = 8538281319560634438L;
	
	private Integer userId; 
	private String login;
	private String userName;
	private String password;
	
	private List<RoleDto> roles;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<RoleDto> getRoles() {
		return roles;
	}
	public void setRoles(List<RoleDto> roles) {
		this.roles = roles;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
