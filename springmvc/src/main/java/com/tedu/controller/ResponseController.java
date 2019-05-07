package com.tedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ResponseController {
	@RequestMapping("/rh")
	public String response(Model model) {
		model.addAttribute("name","Á¢µÃ»¨");
		return "home";
	}
}
