package com.dominiccaggese.springmvc.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dominiccaggese.springmvc.dojosandninjas.models.Dojo;
import com.dominiccaggese.springmvc.dojosandninjas.models.Ninja;
import com.dominiccaggese.springmvc.dojosandninjas.services.DojoService;
import com.dominiccaggese.springmvc.dojosandninjas.services.NinjaService;

@Controller
public class Director {
	
	@Autowired
	private DojoService dojoService;
	@Autowired
	private NinjaService ninjaService;
	
	//Mapping for new dojo page currently not connected or interacting with db
	@GetMapping("/")
	public String newDojo(Model model) {
		model.addAttribute("dojoList", new Dojo());
		return "new_dojo.jsp";
	}
	
	@PostMapping("/add/dojo")
	public String processDojo(
			@Valid @ModelAttribute("dojoList")Dojo dojo,
			BindingResult result) {
		if(result.hasErrors()) {
			return "new_dojo.jsp";
		} else {
			dojoService.newDojo(dojo);
			return "redirect:/";
		}
		
	}
	@GetMapping("/new/ninja")
	public String newNinja(@ModelAttribute("newNinja") Ninja ninja, Model model) {
		model.addAttribute("dojoList", dojoService.getAllDojos());
		model.addAttribute("newNinja", new Ninja());
		return "new_ninja.jsp";
	}
	
	//Mapping for new ninja page currently not connected or interacting with db
	@PostMapping("/add/ninja")
	public String processNinja(
			@Valid @ModelAttribute("newNinja") Ninja ninja,
			BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("dojoList", dojoService.getAllDojos());
			return "new_ninja.jsp";
		} else {
			ninjaService.newNinja(ninja);
			return "redirect:/new/ninja";
		}
	}
	
	//Mapping for show dojo page currently not connected or interacting with db
	@GetMapping("/show/dojo/{id}")
	public String showDojo(
			@PathVariable("id") Long id,
			Model model) {
		model.addAttribute("ninjaList", ninjaService.getNinjasByDojo(id));
		return "dojo_and_ninjas.jsp";
	}
	
}
