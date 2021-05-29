package com.mars.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.mars.pojo.User;

@Controller
public class TestController {

	@RequestMapping("/showUsers")
	public String showUsers(Model model) {
		List<User> users = new ArrayList<User>();
		users.add(new User(1, "张三一", 22));
		users.add(new User(2, "李四五", 20));
		users.add(new User(3, "王六一", 26));

		model.addAttribute("users", users);

		return "userList";
	}

	@RequestMapping("/fileUpload")
	@ResponseBody
	public Map<String, Object> fileUpload(MultipartFile filename) throws Exception {
		System.out.println(filename.getOriginalFilename());
		
		filename.transferTo(new File("e:/"+filename.getOriginalFilename()));
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("msg", "ok");
		
		return map;
	}

	@RequestMapping("/index")
	public String showException() {
		//int a = 10/0;
		
		//String str = null;
		//str.length();
		
		int[] arr = {};
		int a = arr[0];
		
		return "index";
	}
	
	@RequestMapping("/addUser")
	public String addUser(@ModelAttribute("uu") User user) {
		return "userInfo";
	}
	
	@RequestMapping("/saveUser")
	public String saveUser(@ModelAttribute("uu") @Valid User user, BindingResult result) {
		if(result.hasErrors()) { //校验不通过，返回编辑页面
			return "userInfo";
		}
		
		return "success";
	}
}
