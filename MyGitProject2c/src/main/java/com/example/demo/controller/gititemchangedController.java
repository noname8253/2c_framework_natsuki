package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class gititemchangedController {
	
	@GetMapping("/gititemchanged")
public String gititemchanged(String itemname,String price,Model model) {
	String Itemname = itemname;
	String itemprice = price;
	model.addAttribute("ITEMNAME",Itemname);
	model.addAttribute("ITEMPRICE",itemprice);
	return "gititemchanged";
}
}
