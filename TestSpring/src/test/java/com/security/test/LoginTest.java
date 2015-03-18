package com.security.test;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.entity.UserEntity;
import com.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-portal.xml")
public class LoginTest {

	@Autowired
	private IUserService userService;
	
	@Test
    public void testGetUserst() {
		UserEntity user = userService.findUserByLogin("user");
		Assert.assertNotNull(user);
    }
	
	@Test
	public void testAspectJMethode(){
		userService.testAspectJ();
	}
}
