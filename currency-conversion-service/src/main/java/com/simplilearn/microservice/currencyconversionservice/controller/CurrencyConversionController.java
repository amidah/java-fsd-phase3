package com.simplilearn.microservice.currencyconversionservice.controller;

import java.math.BigDecimal;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.microservice.currencyconversionservice.model.CurrencyConversionBean;

@RestController
public class CurrencyConversionController {
	
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to, @PathVariable String quantity) {
		return new CurrencyConversionBean(100L, from, to,new BigDecimal(80), new BigDecimal(100), new BigDecimal(8000));
	}

}
