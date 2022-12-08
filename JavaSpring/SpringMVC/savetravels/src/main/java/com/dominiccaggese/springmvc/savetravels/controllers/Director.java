package com.dominiccaggese.springmvc.savetravels.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.dominiccaggese.springmvc.savetravels.models.Expense;
import com.dominiccaggese.springmvc.savetravels.services.ExpenseService;

@Controller
public class Director {
	
	@Autowired
	private ExpenseService expenseService;
	
	@GetMapping("/")
	public String dashboard(Model model) {
		model.addAttribute("expenses", expenseService.getExpenses());
		model.addAttribute("expensesList", new Expense());
		return "index.jsp";
	}
	
	@PostMapping("/add/expense")
	public String addExpense(
			@Valid @ModelAttribute("expensesList")Expense expense,
			BindingResult result,Model model) {
		if(result.hasErrors()) {
			model.addAttribute("expenses", expenseService.getExpenses());
			return "index.jsp";
		}else {
			expenseService.addExpense(expense);
			return "redirect:/";
		}
	}
	
	@GetMapping("/edit/expense/{id}")
	public String editExpense(@PathVariable("id")Long id, Model model) {
		Expense expense = expenseService.oneExpense(id);
		model.addAttribute("expense", expense);
		return "showExpense.jsp";
	}
	
	@PutMapping("/edit/expense/{id}")
	public String updateExpense(
			@Valid @ModelAttribute("expense")Expense expense,
			BindingResult result) {
		if(result.hasErrors()) {
			return "showExpense.jsp";
		}else {
			expenseService.updateExpense(expense);
			return "redirect:/";
		}
		
	}
	
	@GetMapping("/show/{id}")
	public String showExpense(@PathVariable("id")Long id, Model model) {
		Expense expense = expenseService.oneExpense(id);
		model.addAttribute("expense", expense);
		return "expenseDetails.jsp";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteExpense(@PathVariable("id")Long id) {
		expenseService.deleteExpense(id);
		return "redirect:/";
	}
	
}
