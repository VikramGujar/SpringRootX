package com.vik.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeassionFinder 
{
	private LocalDate date;	// HAS-A-RELATION
	
	
	public SeassionFinder()
	{
		System.out.println("Default constructor of SeassionFinder class called via IOC Container");
	}
	
	@Autowired
	public void setDate(LocalDate date)
	{
		this.date = date;
	}
	
	// Business method
	public String findSeassion()
	{
		int month = date.getMonthValue();
		
		if(month > 2)
		{
			return "Summer session";
		}else if(month >6)
		{
			return "Rainy session";
		}else
		{
			return "Winter session";
		}
	}
	
	
	
	
	
	
	
}
