package com.wrp.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wrp.demo.model.Users;
import com.wrp.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/findById/{id}")
	public String findById(@PathVariable String id, HttpServletRequest request) {
		Users users = userService.findById(id);
		request.setAttribute("users", users);
		return "showUser";

	}

}
