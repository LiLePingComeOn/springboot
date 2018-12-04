package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {

	@Autowired
	private User user;
	
	@RequestMapping(value="/hello")
	public User firstAction() {
		return user;
	}
}
