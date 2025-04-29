package com.vik.beans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tg")
public class TimeGenrator 
{	
	@Autowired
	private LocalTime localTime; // HAS-A Property 
	
	public void printTime()
	{
		int h = localTime.getHour();
		int m = localTime.getMinute();
		int s = localTime.getSecond();
		
		System.out.println("Time is [ "+h+":"+m+":"+s+" ]");
		
	}
}
