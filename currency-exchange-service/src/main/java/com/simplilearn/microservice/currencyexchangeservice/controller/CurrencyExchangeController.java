package com.simplilearn.microservice.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.microservice.currencyexchangeservice.model.ExchangeValue;
import com.simplilearn.microservice.currencyexchangeservice.repository.ExchangeValueRespository;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private ExchangeValueRespository exchangeValueRespository;

	@GetMapping("/currency-exchange/from/{from}/to/{to}") // {from} {to} - path variables
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		return exchangeValueRespository.findByFromAndTo(from, to);
	}
}
