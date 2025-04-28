package com.vik.beans;

import java.time.LocalTime;

public class WishMassageGenrator 
{
	// HAS-A Relation
	// LocalTime is dependent to WishMassageGenrator class
	LocalTime localTime ;
	
	
	public WishMassageGenrator() 
	{
		System.out.println("WishMassageGenrator class constructor called");
	}

	// Setter method for dependency injection
	public void setLocalTime(LocalTime localTime) 
	{
		System.out.println("Call to setLocalTime setter method");
		this.localTime = localTime;
	}

	// Business Method 
	public String showWishMassage(String user)
	{
		System.out.println("Call to business method showWishMassage");
		// This method returns hours in 1-24 hours clock
		int hour = localTime.getHour();
		
		// Business logic for showing massage
		if(hour<12)
		{
			return "Good Morning "+user+" !!!";
		}else if(hour<16)
		{
			return "Good Afternoon "+user+" !!!";
		}else if(hour<19)
		{
			return "Good Evining "+user+" !!!";
		}else
		{
			return "Good Night "+user+" !!!";
		}
	}
}
