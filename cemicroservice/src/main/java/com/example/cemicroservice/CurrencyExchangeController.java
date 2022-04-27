package com.example.cemicroservice;

import java.math.BigDecimal;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cemicroservice.ExchangeValue;
import com.example.cemicroservice.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	 private ExchangeValueRepository  exrepo;
	
	
	@GetMapping("/currency-exchange-service/from/{fromUSD}/to/{toINR}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String fromUSD , @PathVariable String toINR)
	{
		ExchangeValue exchangeValue = exrepo.findByFromUSDAndToINR(fromUSD, toINR);
		if(exchangeValue == null)
		{
			throw new RuntimeException("unable to find"+fromUSD+"--"+toINR+"..");
		}
		
		String port = environment.getProperty("local.server.port");
		exchangeValue.setEnvironment(port);
		//exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return exchangeValue;
	}

}
