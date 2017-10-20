package com.zm.service.impl;

import com.zm.dao.impl.UserDAO;
import com.zm.model.User;
import com.zm.service.IUserService;

public class UserService implements IUserService {

	private UserDAO userdao;
	
	public UserDAO getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDAO userdao) {
		this.userdao = userdao;
	}

	@Override
	public void act(User u) {
		userdao.eat(u);
		userdao.talk(u);
	}

}
