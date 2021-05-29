package com.mars.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mars.TestApplication;
import com.mars.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { TestApplication.class })
public class UserServiceTest {

	@Autowired
	private UserService userService;

	@Test
	public void testSaveUser() {
		this.userService.saveUser();
	}
}
