package com.test.user;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.entity.UserEntity;
import com.service.IUserService;
import com.test.config.AbstractTest;

public class UserTest extends AbstractTest{

	@Autowired
	private IUserService userService;
	
	@Test
	public void testGetAllUsers(){
		List<UserEntity> users = userService.getAllUsers();
		Assert.assertNotNull(users);
	}
	
	@Test
	public void testFindUserByLogin(){
		UserEntity user = userService.findUserByLogin("admin");
		Assert.assertEquals("ADMIN", user.getUserName());
	}
}
