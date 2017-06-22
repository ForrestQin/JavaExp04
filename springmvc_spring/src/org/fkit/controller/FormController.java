package org.fkit.controller;

import org.fkit.model.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * 动态页面跳转控制器
 * */
@Controller
public class FormController{

	@Autowired
    private Bean bean; 
	
	@RequestMapping(value="/{formName}")
	 public String loginForm(@PathVariable String formName,Model model){
		model.addAttribute("message",bean.sayHi());
		// 动态跳转页面
		return formName;
	}

}

