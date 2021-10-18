package com.justin.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeContoller {
	
	@RequestMapping("/home")
	public String home(HttpServletRequest req, HttpServletResponse res) {
		HttpSession session = req.getSession();		
		String name = req.getParameter("name");
		System.out.println("hi " + name);
		session.setAttribute("name", name);
		return "home";
	}
	
	@RequestMapping("/home2")
	public String home2(String name, HttpSession session) {
		System.out.println("hi " + name);
		session.setAttribute("name", name);
		return "home";
	}
	
	@RequestMapping("/home3")
	public String home3(@RequestParam("name") String myName, HttpSession session) {
		System.out.println("hi " + myName);
		session.setAttribute("name", myName);
		return "home";
	}
	
	@RequestMapping("/home4")
	public ModelAndView home4(@RequestParam("name") String myName) {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("name", myName);
		return mv;
	}
}
