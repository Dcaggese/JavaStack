package com.dominiccaggese.springmvc.burgertracker.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dominiccaggese.springmvc.burgertracker.models.Burger;
import com.dominiccaggese.springmvc.burgertracker.services.BurgerService;

@Controller
public class Director {
	
	@Autowired
	private BurgerService burgerService;
	
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		model.addAttribute("burgersList", burgerService.allBurgers());
		model.addAttribute("burgerList", new Burger());
		return "index.jsp";
	}
	@PostMapping("/add/burger")
	public String addBurger(
			@Valid @ModelAttribute("burgerList")Burger burger,
			BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("burgersList", burgerService.allBurgers());
			return "index.jsp";
		}
		burgerService.createBurger(burger);
		return "redirect:/dashboard";
	}
}
