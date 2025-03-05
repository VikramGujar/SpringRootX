package com.vik.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDayFinder 
{

	// @Autowired for Field Injection
	private LocalDate date;
	
	// Constructor Injection
	public WeekDayFinder(LocalDate date)
	{
		System.out.println("0 Param Constructor");
		this.date = date;
		 
	}
	
	/* Setter injection
	@Autowired
	public void setDate(LocalDate date)
	{
		System.out.println("Setter setDate");
		this.date = date;
	}
	*/
	
	//Business Method 
	public String showMessage(String user)
	{
		int weekDay = date.getDayOfWeek().getValue();
		
		if(weekDay>5)
		{
			return user+" Enjoy your weekend!!!";
		}else 
		{
			return user+" Work Hard to become Software devoloper";
		}
	}
}
