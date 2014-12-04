package com.business;

import java.util.List;

import com.persistence.entity.UserEntity;

public interface IUserDomain {

	List<UserEntity> getAllUsers();
	
	UserEntity findUserByLogin(String login);
}
