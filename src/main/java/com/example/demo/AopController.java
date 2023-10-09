package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AopController {

	@Autowired
	private UserService userService;


	@RequestMapping("/hello")
	public String sayHello(){
		return userService.getUserId(11);
	}

}
