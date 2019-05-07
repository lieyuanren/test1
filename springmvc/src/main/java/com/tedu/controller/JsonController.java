package com.tedu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**����һ��json��*/
@Controller
public class JsonController {
	@RequestMapping("/json")
	@ResponseBody
	public List<User>json() {
		List<User> list=new ArrayList<>();
		list.add(new User("ս��",18));
		list.add(new User("����",21));
		list.add(new User("����",33));
		list.add(new User("Ǯ��",12));	
		return list;
	}
}
