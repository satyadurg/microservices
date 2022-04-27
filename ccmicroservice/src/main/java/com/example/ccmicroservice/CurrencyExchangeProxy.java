package com.example.ccmicroservice;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//@FeignClient(name="currency-exchange", url="localhost:8000")
@FeignClient(name="currency-exchange")
public interface CurrencyExchangeProxy {
	@GetMapping("/currency-exchange-service/from/{fromUSD}/to/{toINR}\"")
	public CurrencyConversion retrieveExchangeValue(
			@PathVariable String fromUSD,
			@PathVariable String toINR);

}
