package com.dominiccaggese.springmvc.savetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dominiccaggese.springmvc.savetravels.models.Expense;

public interface ExpenseRepository extends CrudRepository<Expense,Long> {
	List<Expense> findAll();
}
