package com.dominiccaggese.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControllers {
	@RequestMapping("/")
	public String hello(@RequestParam(value="name",required=false)String name,
			@RequestParam(value="last",required=false)String last) {
		if(name != null && last != null) {
			return "Hello " + name + " " + last;
		} else if(name != null) {
			return "Hello " + name;
		} else {
			return "Hello Human";
		}
	}
}