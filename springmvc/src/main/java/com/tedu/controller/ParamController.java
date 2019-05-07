package com.tedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * �������Ͳ�����
 * springmvc���Զ��Ľ������а����Ĳ����ͷ����Ĳ�������ƥ�䣬
 * Ҳ����˵ֻҪ��֤�������еĲ������ƺͷ����еĲ����������Ӧ���������ĸ�ʽҲҪ��ȷ����
 * �ڷ����оͿ���ʹ����Щ�������������еĲ�����*/
@Controller
public class ParamController {
	/**
	 * �������Ͳ�����
	 * springmvc���Զ��Ľ������а����Ĳ����ͷ����Ĳ�������ƥ�䣬
	 * Ҳ����˵ֻҪ��֤�������еĲ������ƺͷ����еĲ����������Ӧ���������ĸ�ʽҲҪ��ȷ����
	 * �ڷ����оͿ���ʹ����Щ�������������еĲ�����*/
	@RequestMapping("/param")
	public String paramTest(String name,Integer age) {
		System.out.println("name="+name);
		System.out.println("age="+age);
		return "home";
	}
	
	/**��װ���Ͳ�����*/
	@RequestMapping("/param1")
	public String param1(User user) {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		return "home";
	}
}
