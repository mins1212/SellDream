package com.portfolio.selldream.controller;

import java.util.List;
import java.util.Locale;
import java.util.Map;

//import com.google.gson.Gson;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.portfolio.selldream.service.UserService;

@Controller
public class UserController {
	
	@Resource
	UserService userService;
	
	@RequestMapping(value = "/userlist", method = RequestMethod.GET)
	@ResponseBody
	public List<Map<String, Object>> userList(Locale locale, Model model) {
		//Gson gson = new Gson();
		//String list = gson.toJson(userService.list());
		List<Map<String, Object>> data = userService.list();
		return data;
	}
	
}
