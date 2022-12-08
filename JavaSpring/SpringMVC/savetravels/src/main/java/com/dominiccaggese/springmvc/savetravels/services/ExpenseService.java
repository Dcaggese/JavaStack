package com.dominiccaggese.springmvc.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dominiccaggese.springmvc.savetravels.models.Expense;
import com.dominiccaggese.springmvc.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	@Autowired
	private ExpenseRepository expenseRepo;
	
	//Constructor
	public ExpenseService(ExpenseRepository expenseRepo) {
		this.expenseRepo = expenseRepo;
	}
	
	//create expense
	public Expense addExpense(Expense name) {
		return expenseRepo.save(name);
	}
	
	//get all expenses
	public List<Expense> getExpenses(){
		return expenseRepo.findAll();
	}
	
	//find one
	public Expense oneExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepo.findById(id);
		if (optionalExpense.isPresent()) {
			return optionalExpense.get();
		} else {
			return null;
		}
	}
	
	//update expense
	public Expense updateExpense(Expense id) {
		return expenseRepo.save(id);
	}
	
	//delete expense
	public void deleteExpense(Long id) {
		expenseRepo.deleteById(id);
	}
}
