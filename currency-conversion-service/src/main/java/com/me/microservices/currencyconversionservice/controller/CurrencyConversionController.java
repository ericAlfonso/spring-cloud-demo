package com.me.microservices.currencyconversionservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.me.microservices.currencyconversionservice.client.CurrencyExchangeClient;
import com.me.microservices.currencyconversionservice.entity.CurrencyConversion;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyExchangeClient currencyExchangeClient;

	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion getCurrencyConversion(
				@PathVariable("from") String from, @PathVariable("to") String to,
				@PathVariable("quantity") BigDecimal quantity) {
		
		CurrencyConversion conversion =  currencyExchangeClient.retrieveExchangeValue(from, to);
		return new CurrencyConversion(conversion.getId(), from, to, conversion.getConversionMultiple(), 
					quantity, quantity.multiply(conversion.getConversionMultiple()), conversion.getPort());
	}
}
