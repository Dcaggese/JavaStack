package com.dominiccaggese.springmvc.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dominiccaggese.springmvc.dojosandninjas.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	
	List<Ninja> findAll();
	
	List<Ninja> findAllByDojoId(Long id);
}
