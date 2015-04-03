package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.persistence.entity.UserEntity;
import com.service.IUserService;

@SuppressWarnings("restriction")
@Service
@WebService(name="IUserService", serviceName="users")
public class UserServiceImpl implements IUserService{


	@Override
	public List<UserEntity> getAllUsers() {
		return new ArrayList<UserEntity>();
	}

	@Override
	public UserEntity findUserByLogin(String login) {
		return new UserEntity();
	}

}
