package com.persistence;

import java.util.List;

import com.persistence.entity.UserEntity;

public interface IUserRepository {

	List<UserEntity> getAllUsers();
	
	UserEntity findUserByLogin(String login);
}
