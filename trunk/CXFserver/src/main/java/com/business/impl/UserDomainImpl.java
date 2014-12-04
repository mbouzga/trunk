package com.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.business.IUserDomain;
import com.persistence.IUserRepository;
import com.persistence.entity.UserEntity;

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
