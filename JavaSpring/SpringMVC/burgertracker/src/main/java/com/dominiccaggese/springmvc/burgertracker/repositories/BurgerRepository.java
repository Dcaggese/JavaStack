package com.dominiccaggese.springmvc.burgertracker.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dominiccaggese.springmvc.burgertracker.models.Burger;

@Repository
public interface BurgerRepository extends CrudRepository<Burger, Long>{
	//retrieve all burgers from the database
	List<Burger> findAll();
}
