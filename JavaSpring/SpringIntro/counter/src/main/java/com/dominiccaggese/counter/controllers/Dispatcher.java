package com.dominiccaggese.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Dispatcher {
	@GetMapping("/")
	public String welcome(HttpSession session) {
		if(session.getAttribute("counter") == null){
			session.setAttribute("counter", 0);
		} else {
			Integer count = (Integer) session.getAttribute("counter");
			session.setAttribute("counter", count+1);
		}
		return "index.jsp";
	}
	@GetMapping("/counter")
	public String counter() {
		return "counter.jsp";
	}
	
	@GetMapping("/reset")
	public String resetCounter(HttpSession session) {
		if(session.getAttribute("counter") != null){
			session.setAttribute("counter", 0);
		}
		return "counter.jsp";
	}
}
