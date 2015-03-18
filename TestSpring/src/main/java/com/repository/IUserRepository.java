package com.repository;

import java.util.List;

import com.entity.UserEntity;

public interface IUserRepository {

	List<UserEntity> getAllUsers();
	
	UserEntity findUserByLogin(String login);
}
