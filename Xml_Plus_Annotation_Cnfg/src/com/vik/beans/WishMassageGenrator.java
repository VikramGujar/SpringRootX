package com.vik.beans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMassageGenrator 
{
	@Autowired
	LocalTime lt;
	
	@Autowired
	LocalDate ld;
	
	public String Massage()
	{
		int hour =lt.getHour();
		int date = ld.getDayOfMonth();
		
		return "Todya's date is "+date+" and Time is "+hour+" Hours";
	}
	
}
