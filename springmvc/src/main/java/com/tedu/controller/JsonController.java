package com.tedu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**返回一个json串*/
@Controller
public class JsonController {
	@RequestMapping("/json")
	@ResponseBody
	public List<User>json() {
		List<User> list=new ArrayList<>();
		list.add(new User("战三",18));
		list.add(new User("王五",21));
		list.add(new User("赵六",33));
		list.add(new User("钱七",12));	
		return list;
	}
}
