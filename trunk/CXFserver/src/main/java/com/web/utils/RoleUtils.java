package com.web.utils;

import java.io.Serializable;

import com.persistence.entity.RoleEntity;
import com.web.dto.RoleDto;

public class RoleUtils implements Serializable{

	private static final long serialVersionUID = 5107986262433574198L;

	public static RoleDto mapRoleEntityToDto(RoleEntity roleEntity){
		RoleDto roleDto = null;
		
		if(roleEntity != null){
			roleDto = new RoleDto();
			roleDto.setRoleId(roleEntity.getRoleId());
			roleDto.setRoleName(roleEntity.getRoleName());
		}
		
		return roleDto;
	}
	

	public static RoleEntity mapRoleDtoToEntity(RoleDto roleDto){
		RoleEntity roleEntity = null;
		
		if(roleDto!= null){
			roleEntity = new RoleEntity();
			roleEntity.setRoleId(roleDto.getRoleId());
			roleEntity.setRoleName(roleDto.getRoleName());
		}
		
		return roleEntity;
	}
}
