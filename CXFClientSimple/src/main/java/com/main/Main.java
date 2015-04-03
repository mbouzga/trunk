package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext content = new ClassPathXmlApplicationContext(
				"classpath:applicationContext-portal.xml");
		System.out.println("OK");
	}
}
