package com.tedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 基本类型参数绑定
 * springmvc会自动的将请求中包含的参数和方法的参数进行匹配，
 * 也就是说只要保证，请求中的参数名称和方法中的参数名称相对应（另，参数的格式也要正确），
 * 在方法中就可以使用这些参数—即请求中的参数。*/
@Controller
public class ParamController {
	/**
	 * 基本类型参数绑定
	 * springmvc会自动的将请求中包含的参数和方法的参数进行匹配，
	 * 也就是说只要保证，请求中的参数名称和方法中的参数名称相对应（另，参数的格式也要正确），
	 * 在方法中就可以使用这些参数—即请求中的参数。*/
	@RequestMapping("/param")
	public String paramTest(String name,Integer age) {
		System.out.println("name="+name);
		System.out.println("age="+age);
		return "home";
	}
	
	/**包装类型参数绑定*/
	@RequestMapping("/param1")
	public String param1(User user) {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		return "home";
	}
}
