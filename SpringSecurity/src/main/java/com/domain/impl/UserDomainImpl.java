package com.domain.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.IUserDomain;
import com.entity.UserEntity;
import com.repository.IUserRepository;

@Service("userDomain")
public class UserDomainImpl implements IUserDomain{

	@Autowired
	private IUserRepository userRepository;
	@Override
	public List<UserEntity> getAllUsers() {
		return userRepository.getAllUsers();
	}
	@Override
	public UserEntity findUserByLogin(String login) {
		return userRepository.findUserByLogin(login);
	}

}
