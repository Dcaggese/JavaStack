package com.dominiccaggese.springmvc.loginandregistration.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.dominiccaggese.springmvc.loginandregistration.models.User;

public interface UserRepository extends CrudRepository<User,Long>{

	Optional<User> findByEmail(String email);
}
