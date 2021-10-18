package com.justin.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlienController {
	
	@RequestMapping("/alien")
	public ModelAndView alien(Alien alien) {
		ModelAndView mv = new ModelAndView("alien");
		mv.addObject("data", alien);
		
		return mv;
	}
}
