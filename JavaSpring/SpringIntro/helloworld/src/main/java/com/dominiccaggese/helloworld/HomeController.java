package com.dominiccaggese.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;


@Controller
public class HomeController {
	
//	@RequestMapping("/") //annotation
//	public String index(@RequestParam(value = "q", required = false) String searchQuery) {
//		if (searchQuery != null) {
//			return "You searched for: " + searchQuery;
//		} else {
//			return "Hello";
//		}
//	}
	@RequestMapping("/jstl")
	public String jstl(Model model) {
		model.addAttribute("fruit", "banana");
		return "demo.jsp";
	}
}
