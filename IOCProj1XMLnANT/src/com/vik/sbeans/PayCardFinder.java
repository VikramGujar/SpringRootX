package com.vik.sbeans;
// In this program you have to get current date 
// and find whether it is starting or ending of month
// according to that user will pay
// If month start Pay via Account 
// If month end pay via credit card 

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("pcf")
public class PayCardFinder 
{
	// @Autowired If you want Filed injection
	private LocalDate date;
	
	
	// @Autowired If you want Constructor Injection
	public PayCardFinder(LocalDate date)
	{
		System.out.println("PayCardFinder Constructor called ");
		this.date = date;
	}
	
	//@Autowired If you want Setter injection
	public void setDate(LocalDate date)
	{
		System.out.println("Setter call for Date");
		this.date = date;
	}
	
	public String findCard(String user)
	{
		int dayOfMonth = date.getDayOfMonth();
		
		if(dayOfMonth>=25)
		{
			return "End of month!\n"+user+" Will pay via Credit Card";
		}else
		{
			return user+" can pay via account balance";
		}
	}
	
	
}
