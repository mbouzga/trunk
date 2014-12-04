package com.web.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.persistence.entity.RoleEntity;
import com.persistence.entity.UserEntity;
import com.web.dto.RoleDto;
import com.web.dto.UserDto;

public class UserUtils implements Serializable {

	private static final long serialVersionUID = -8237094668235675445L;

	public static UserDto mapUserEntityToDto(UserEntity userEntity) {
		UserDto userDto = null;
		List<RoleDto> roles;

		if (userEntity != null) {
			userDto = new UserDto();
			roles = new ArrayList<>();

			userDto.setUserId(userEntity.getUserId());
			userDto.setUserName(userEntity.getUserName());
			userDto.setLogin(userEntity.getLogin());
			userDto.setPassword(userEntity.getPassword());
			for (RoleEntity roleEntity : userEntity.getRoles()) {
				roles.add(RoleUtils.mapRoleEntityToDto(roleEntity));
			}
			userDto.setRoles(roles);
		}

		return userDto;
	}

	public static UserEntity mapUserDtoToEntity(UserDto userDto) {
		UserEntity userEntity = null;

		if (userDto != null) {
			userEntity = new UserEntity();
			
			userEntity.setUserId(userDto.getUserId());
			userEntity.setUserName(userDto.getUserName());
			userEntity.setLogin(userDto.getLogin());
			userEntity.setPassword(userDto.getPassword());
		}

		return userEntity;
	}
}
