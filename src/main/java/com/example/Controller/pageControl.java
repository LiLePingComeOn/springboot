package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 控制页面的跳转
 * 2018.12.01
 */

@Controller
public class pageControl {

	@RequestMapping({"/","/index.html"})
	public String toIndex() {
		return "index";
	}
}
