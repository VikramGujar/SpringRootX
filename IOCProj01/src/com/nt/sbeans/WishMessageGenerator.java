package com.nt.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator 
{
	private LocalTime time;
	
	/* Constructor for constructor injection 
	public WishMessageGenerator(LocalTime time)
	{
		System.out.println("1 Param Constructor of WishMessageGenrator class");
		this.time = time;
	}
	*/
	
	//setter method for setter injection 
	public void setTime(LocalTime time)
	{
		this.time = time;
	}
	
	
	
	// 19. Control comes to business method 
	public String showWishMessage(String user)
	{
		// 20. get current hour of the day 
		int hour = time.getHour();
		
		// 21. generate wish message based on current hour of the day 
		if(hour<12)
		{
			return "Good Morning : "+user;
		}else if(hour<16)
		{
			return "Good Afternoon : "+user;
		}else if(hour<20)
		{
			return "Good Evening : "+user;
		}else
		{
			return "Good Night : "+user; 
		}
		// 22. Returns the result 
	}
}
