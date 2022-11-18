package io.betterbanking.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import io.betterbanking.entity.Transaction;

@Service
public class TransactionService {

	public List<Transaction> findAllByAccountNumber(final Integer accountNumber) {
		return List.of(Transaction
						.builder()
						.type("credit")
						.date(new Date())
						.accountNumber(accountNumber)
						.currency("USD")
						.amount(100.00)
						.merchantName("acme")
						.merchantLogo("images/acme-logo.png")
						.build()
		);
	}
}