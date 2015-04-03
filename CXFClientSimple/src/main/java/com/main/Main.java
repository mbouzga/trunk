package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.IUserService;
import com.service.UserEntity;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext content = new ClassPathXmlApplicationContext(
				"classpath:applicationContext-portal.xml");
		IUserService userServices = (IUserService) content.getBean("user");
		UserEntity userEntity = userServices.findUserByLogin("TEST");
		System.out.println("Test Ok : Login = " + userEntity.getLogin());
	}
}
