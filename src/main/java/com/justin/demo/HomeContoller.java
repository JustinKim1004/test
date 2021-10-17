package com.justin.demo;

import org.springframework.stereotype.Controller;

@Controller
public class HomeContoller {
	public String home() {
		return "home.jsp";
	}
}
