package com.jlawal.demo.elibrary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping(value = { "/home", "/elibrary/home" })
	public String displayHomePage() {
		return "home/index";
	}

	@GetMapping(value = { "about", "/elibrary/about" })
	public String displayAboutPage() {
		return "home/about";
	}
}
