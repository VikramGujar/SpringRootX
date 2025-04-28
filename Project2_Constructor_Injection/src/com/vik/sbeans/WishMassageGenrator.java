package com.vik.sbeans;

import java.time.LocalTime;

public class WishMassageGenrator 
{
	// HAS-A Property 
	LocalTime localTime;

	// Parameterized constructor for constructor injection
	public WishMassageGenrator(LocalTime localTime) 
	{
		System.out.println("WishMassageGenrator [ One Param Constructor ] ");
		this.localTime = localTime;
	}
	
	// Business Method 
	public String showMassage(String user)
	{
		System.out.println("WishMassageGenrator.showMassage() [ Business Mthod ]");
		
		// To get current hour of the day [ 1-24 ]
		int hour = localTime.getHour();
		
		// Business logic for generating massage 
		if(hour<12)
		{
			return "Good Morning!!! "+user;
		}else if(hour<16)
		{
			return "Good Afternoon!!! "+user;
		}else if(hour<19)
		{
			return "Good Evining!!! "+user;
		}else
		{
			return "Good Night!!! "+user;
		}
		
	}
	
	
}
