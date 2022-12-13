package com.dominiccaggese.springmvc.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dominiccaggese.springmvc.dojosandninjas.models.Ninja;
import com.dominiccaggese.springmvc.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	@Autowired
	private NinjaRepository ninjaRepo;
	
	//Constructor
	public NinjaService(NinjaRepository ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	//Create Ninja
	public Ninja newNinja(Ninja name) {
		return ninjaRepo.save(name);
	}
	
	//Get all ninjas
	public List<Ninja> getAllNinjas(){
		return ninjaRepo.findAll();
	}
	
	//get ninjas by dojoId
	public List<Ninja> getNinjasByDojo(Long id){
		return ninjaRepo.findAllByDojoId(id);
	}
}
