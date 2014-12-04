package com.persistence.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "USER")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class UserEntity implements Serializable{

	private static final long serialVersionUID = 1035446221024593097L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID", unique = true)
	@XmlAttribute
	private Integer userId;
	
	@Column(name = "LOGIN")
	@XmlAttribute
	private String login;
	
	@Column(name = "PASSWORD")
	@XmlAttribute
	private String password;
	
	@Column(name = "USER_NAME")
	@XmlAttribute
	private String userName;
	
	@ManyToMany
	@JoinTable(name = "J_USER_ROLE", joinColumns = @JoinColumn(name ="USER_ID"), inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
	@XmlElement
	private List<RoleEntity> roles;
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<RoleEntity> getRoles() {
		return roles;
	}
	public void setRoles(List<RoleEntity> roles) {
		this.roles = roles;
	}
	
}
