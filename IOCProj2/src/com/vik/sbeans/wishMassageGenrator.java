package com.vik.sbeans;

import java.time.LocalTime;

public class wishMassageGenrator 
{
	private LocalTime time;
	
	public wishMassageGenrator(LocalTime time)
	{
		this.time = time;
	}
	
	public String showMassage(String user)
	{
		int hour = time.getHour();
		
		if(hour<12)
		{
			return "Good Morning "+user;
		}else if(hour<16)
		{
			return "Good Afternoon "+user;
		}else if(hour<20)
		{
			return "Good Evining "+user;
		}else {
			return "Good Night"+user;
		}
	}
}
