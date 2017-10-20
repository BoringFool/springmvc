package com.zm.dao.impl;

import com.zm.dao.IUserDAO;
import com.zm.model.User;

public class UserDAO implements IUserDAO {

	@Override
	public void eat(User u) {
		System.out.println("³Ô£¡£¡£¡");

	}

	@Override
	public void talk(User u) {
		System.out.println("Ëµ£¡£¡£¡");
	}

}
