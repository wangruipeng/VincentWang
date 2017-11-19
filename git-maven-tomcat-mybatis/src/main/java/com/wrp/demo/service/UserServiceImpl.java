package com.wrp.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wrp.demo.dao.UsersMapper;
import com.wrp.demo.model.Users;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UsersMapper usersMapper;

	public Users findById(String id) {
		return usersMapper.findById(id);
	}

}
