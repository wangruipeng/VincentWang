package com.wrp.demo.service;

import com.wrp.demo.model.Users;

public interface UserService {

	public Users findById(String id);
	
	public int insert(Users record);
}
