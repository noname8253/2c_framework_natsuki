package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class gitItemEditController {

	//画面表示用
	@GetMapping("/gititemedit")
	public String doEditGet() {
		
		//htmlを表示
		return "gititemedit";
	}
	@GetMapping("/gititechanged")
	public String doEditPost(Model model) {
		return "gititemchanged";
	}
}
