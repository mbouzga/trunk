package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.domain.IUserDomain;
import com.entity.UserEntity;
import com.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserDomain userDomain;
	
	@Override
	public void addUser() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    System.out.println("User name : " + auth.getName());
	    System.out.println("User role : " + auth.getAuthorities().iterator().next());
		System.out.println(" **************** Add Service ************");
	}

	@Override
	public List<UserEntity> getAllUsers() {
		return userDomain.getAllUsers();
	}

	@Override
	public UserEntity findUserByLogin(String login) {
		return userDomain.findUserByLogin(login);
	}

}
