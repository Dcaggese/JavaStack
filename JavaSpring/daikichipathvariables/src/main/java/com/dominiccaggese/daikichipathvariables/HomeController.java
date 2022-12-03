package com.dominiccaggese.daikichipathvariables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class HomeController {
	@RequestMapping("/travel/{city}")
	public String welcome(@PathVariable("city")String city) {
		return "Congratulations! You will soon travel to "+city;
	}
	
	@RequestMapping("/lotto/{number}")
	public String lotto(@PathVariable("number") int id) {
		if(id%2 == 0) {
			return "You will take a grand journey in the near future, but be wary of tempting offers.";
		} else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend with family and friends.";
		}
	}
}
