package com.dominiccaggese.springmvc.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dominiccaggese.springmvc.dojosandninjas.models.Dojo;
import com.dominiccaggese.springmvc.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	//Dependency Injection of Repository
	private final DojoRepository dojoRepo;
	
	//Constructor
	public DojoService(DojoRepository dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	
	//Create Dojo
	public Dojo newDojo(Dojo name) {
		return dojoRepo.save(name);
	}
	
	//Get one Dojo
	public Dojo getDojo(Long id) {
		Optional<Dojo> dojo = dojoRepo.findById(id);
		if(dojo.isPresent()) {
			return dojo.get();
		} else {
			return null;
		}
	}
	
	//Get All Dojos
	public List<Dojo> getAllDojos(){
		return dojoRepo.findAll();
	}
}
