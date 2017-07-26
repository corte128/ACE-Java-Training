package com.siriuscom.training.OOP3;

public class Phone 
{
	private String brand;
	private String configuration;
	public Phone(String brand, String configuration)
	{
		this.brand = brand;
		this.configuration = configuration;
	}
	
	public String getBrand()
	{
		return brand;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	
	public String getConfiguration()
	{
		return configuration;
	}
	public void setConfiguration(String configuration)
	{
		this.configuration = configuration;
	}
	
}
