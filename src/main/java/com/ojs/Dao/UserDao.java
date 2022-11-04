package com.ojs.Dao;

import com.ojas.model.Users;

public interface UserDao {
	public String register(Users user);

	public String login(String userName, String passWord);

	public String forgot(String userName, String type);
}
