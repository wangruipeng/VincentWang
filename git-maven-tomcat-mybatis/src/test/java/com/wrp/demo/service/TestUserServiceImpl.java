package com.wrp.demo.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wrp.demo.model.Users;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class TestUserServiceImpl {

	@Autowired
	private UserService userService;

	@Test
	public void testFindUserById() {
		Users users = userService.findById("4");
		System.out.println(users);
	}

	@Test
	public void testInsert() {
		Users users = new Users();
		users.setAge("100");
		users.setId(String.valueOf(System.currentTimeMillis()));
		users.setName("laoyaoguai");
		int i = userService.insert(users);
		System.out.println(i);
	}
}
