package com.dominiccaggese.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Dispatcher {
	@GetMapping("/")
	public String omikuji() {
		return "form.jsp";
	}

	@PostMapping("/process")
	public String process(
			@RequestParam("years") Integer years,
			@RequestParam("city") String city,
			@RequestParam("name") String name,
			@RequestParam("hobby") String hobby,
			@RequestParam("creature") String creature,
			@RequestParam("saying") String saying,
			HttpSession session
			) {
		session.setAttribute("years", years);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("hobby", hobby);
		session.setAttribute("creature", creature);
		session.setAttribute("saying", saying);
		
		
		return "redirect:/results";
	}

	@GetMapping("/results")
	public String results() {
		return "result.jsp";
	}
}
