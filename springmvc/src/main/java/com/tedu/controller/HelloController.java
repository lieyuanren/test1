package com.tedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	/* http://localhost/项目名称/hello ===访问路径*/
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("springmvc");
		return "home";
	}
}
