package com.dominiccaggese.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/") //annotation
	public String index() {
		return "Hello World!";
	}

}
