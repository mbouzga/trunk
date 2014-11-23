package com.service;

import java.util.List;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;

import com.entity.UserEntity;

public interface IUserService {

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	void addUser();
	
	List<UserEntity> getAllUsers();
	
	UserEntity findUserByLogin(String login);
}
