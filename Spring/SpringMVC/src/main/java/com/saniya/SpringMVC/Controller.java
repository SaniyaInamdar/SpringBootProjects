package com.saniya.SpringMVC;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping("/get")
	public String get() {
		return "Index";
	}
	
	
	@PostMapping("/add")
	public String welcomeuser(@RequestParam("username") String name,Model model) {
		model.addAttribute("message", "welcome "+ name);
		return "result";
		
	}
}
