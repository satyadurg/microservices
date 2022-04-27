package com.example.cemicroservice;


import org.springframework.data.jpa.repository.JpaRepository;


import com.example.cemicroservice.ExchangeValue; 

public interface ExchangeValueRepository  extends JpaRepository <ExchangeValue, Long> {
	
	ExchangeValue findByFromUSDAndToINR(String fromUSD,String toINR);

}
