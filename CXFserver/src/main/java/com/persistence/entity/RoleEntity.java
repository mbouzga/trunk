package com.persistence.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

@Entity
@Table(name = "ROLE")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class RoleEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4461728329633004233L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ROLE_ID", unique = true)
	@XmlAttribute
	private Integer roleId;
	
	@Column(name = "ROLE_NAME")
	@XmlAttribute
	private String roleName;
	
	@ManyToMany(mappedBy = "roles")
	@XmlElement
	@XmlInverseReference(mappedBy = "roles")
	private List<UserEntity> users;
	
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
	public List<UserEntity> getUsers() {
		return users;
	}
	public void setUsers(List<UserEntity> users) {
		this.users = users;
	}
	
}
