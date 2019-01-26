package com.michael.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Use @Controller to make the dispatcher server
 * @RequestMapping will route the request to the given method
 * 		just use the name of the page without the path and extension
 */

@Controller // Inherent from @Component... so component scanning :D
public class HomeController {

	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
}
