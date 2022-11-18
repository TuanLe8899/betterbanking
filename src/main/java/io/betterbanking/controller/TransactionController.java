package io.betterbanking.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.betterbanking.entity.Transaction;
import io.betterbanking.service.TransactionService;

@RestController
@RequestMapping("/api/v1/transactions")
public class TransactionController {
	
	private final TransactionService transactionService;

	public TransactionController(final TransactionService transactionService) {
		this.transactionService = transactionService;
	}
	
	@GetMapping("/{accountNumber}")
	public List<Transaction> findAllByAccountNumber(@PathVariable("accountNumber") final Integer accountNumber) {
		return transactionService.findAllByAccountNumber(accountNumber);
	}
}
