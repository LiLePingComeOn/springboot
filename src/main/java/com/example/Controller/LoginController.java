package com.example.Controller;

import org.springframework.stereotype.Controller;
/*
 * 处理登录请求
 */
import org.springframework.web.bind.annotation.PostMapping;
@Controller


public class LoginController {

	  
	//post提交，进行密码账号校验
	
	@PostMapping(value = "/user/login")
	public void login(String Username,String Password) {
		
	}
}
