package com.dominiccaggese.springmvc.burgertracker.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dominiccaggese.springmvc.burgertracker.models.Burger;
import com.dominiccaggese.springmvc.burgertracker.repositories.BurgerRepository;

@Service
public class BurgerService {
	private final BurgerRepository burgerRepo;
	
	//Constructor
	public BurgerService(BurgerRepository burgerRepo) {
		this.burgerRepo = burgerRepo;
	}
	
	//create a burger
	public Burger createBurger(Burger burgerName) {
		return burgerRepo.save(burgerName);
	}
	
	//get all burgers
	public List<Burger> allBurgers(){
		return burgerRepo.findAll();
	}
	
	//get one burger
	
	//update burger
	
	//delete burger
}
