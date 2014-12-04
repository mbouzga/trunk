package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.business.IUserDomain;
import com.persistence.entity.UserEntity;
import com.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserDomain userDomain;

	@Override
	public List<UserEntity> getAllUsers() {
		return userDomain.getAllUsers();
	}

	@Override
	public UserEntity findUserByLogin(String login) {
		return userDomain.findUserByLogin(login);
	}

}
