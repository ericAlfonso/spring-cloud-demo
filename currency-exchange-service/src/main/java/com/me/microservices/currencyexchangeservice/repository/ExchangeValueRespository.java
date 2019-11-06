package com.me.microservices.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.microservices.currencyexchangeservice.entity.ExchangeValue;

public interface ExchangeValueRespository extends JpaRepository<ExchangeValue, Long>{

	ExchangeValue findByFromAndTo(String from, String to);
}
