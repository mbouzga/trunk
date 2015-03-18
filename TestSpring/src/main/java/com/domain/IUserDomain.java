package com.domain;

import java.util.List;

import com.entity.UserEntity;

public interface IUserDomain {

	List<UserEntity> getAllUsers();
	
	UserEntity findUserByLogin(String login);
}
