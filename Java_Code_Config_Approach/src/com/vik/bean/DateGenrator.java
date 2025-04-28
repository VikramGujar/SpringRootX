package com.vik.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DateGenrator 
{
	@Autowired
	LocalDate date;
	
	
	
	public DateGenrator() {
		System.out.println("DateGenrator.DateGenrator()");
	}



	public void printDate()
	{
		int day = date.getDayOfMonth();
		int month = date.getMonthValue();
		int year = date.getYear();
		
		System.out.println("Today is [ "+day+"/"+month+"/"+year+"");
	}
}
