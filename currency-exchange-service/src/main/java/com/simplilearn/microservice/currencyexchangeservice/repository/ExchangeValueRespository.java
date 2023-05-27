package com.simplilearn.microservice.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.microservice.currencyexchangeservice.model.ExchangeValue;

public interface ExchangeValueRespository extends JpaRepository<ExchangeValue, Long> {

	ExchangeValue findByFromAndTo(String from, String to);
}
