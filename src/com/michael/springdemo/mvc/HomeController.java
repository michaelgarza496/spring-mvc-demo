package com.michael.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Inherent from @Component... so component scanning :D
public class HomeController {

	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
}
