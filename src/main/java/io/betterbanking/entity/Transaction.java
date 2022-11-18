package io.betterbanking.entity;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Transaction {
	private String type;
	private Date date;
	private Integer accountNumber;
	private String currency;
	private Double amount;
	private String merchantName;
	private String merchantLogo;
}
