package com.zm.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zm.model.User;
import com.zm.service.IUserService;
import com.zm.service.impl.UserService;

public class Testservice {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "beans.xml" });
		IUserService ser = context.getBean("userservice", UserService.class);
		User u = context.getBean("user", User.class);
		u.setAge(25);
		u.setName("zm");
		ser.act(u);
		

	}

}
