package com.example.cemicroservice;

import java.math.BigDecimal;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class ExchangeValue {
	
	@Id
	private Long id;
	
	@Column(name="currency_exchange_from")
	private String fromUSD;
	
	@Column(name="currency_exchange_to")
	private String toINR;
	
	private BigDecimal conversionmultiple;
	
	private String environment;
	
	

	

	public ExchangeValue()
	{
		
	}
	
	public ExchangeValue(Long id, String fromUSD, String toINR, BigDecimal conversionmultiple) {
		super();
		this.id = id;
		this.fromUSD = fromUSD;
		this.toINR = toINR;
		this.conversionmultiple = conversionmultiple;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFromUSD() {
		return fromUSD;
	}

	public void setFromUSD(String fromUSD) {
		this.fromUSD = fromUSD;
	}

	public String getToINR() {
		return toINR;
	}

	public void setToINR(String toINR) {
		this.toINR = toINR;
	}

	public BigDecimal getConversionmultiple() {
		return conversionmultiple;
	}

	public void setConversionmultiple(BigDecimal conversionmultiple) {
		this.conversionmultiple = conversionmultiple;
	}
	
	
	
	
	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	
	
	
	

}
