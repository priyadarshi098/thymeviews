package com.thymeviews.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ThymeviewsController {
	
	@RequestMapping(value="/about", method=RequestMethod.GET)
	public String getAbout(Model model) {
		return "about";
	}
	
	@GetMapping(value="/itr")
	public String iterate(Model model) {
		List<String> names = List.of("satish","manish","rohini","seeema");
		model.addAttribute("name", names);
		return "iterate";
		
	}
	
	@GetMapping(value="/cond")
	public String getConditional(Model model) {
		model.addAttribute("isActive", true);
		//model.addAttribute("gender","M");
		List<Integer> list = List.of(12,34,56,78,90);
		model.addAttribute("mylist", list);
		return "conditional";
	}
	
	@GetMapping(value="/service")
	public String getService(Model model) {
		model.addAttribute("name","Satish Priyadarshi");
		model.addAttribute("address","Gopalpur");
		model.addAttribute("salary",30000);
		return "service";
	}

}
