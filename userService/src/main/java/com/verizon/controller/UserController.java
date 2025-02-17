package com.verizon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.entity.Users;
import com.verizon.service.UsersServiceIntf;

@RestController
@RequestMapping(value = "/login")
public class UserController {
	
	@Autowired
	UsersServiceIntf service;
	
	@GetMapping(value = "/{username}")
	public Users findByName(@PathVariable(value = "username")String username)
	{
		return service.findByUsername(username);
	}

}
