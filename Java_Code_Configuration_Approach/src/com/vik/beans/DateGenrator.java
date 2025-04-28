package com.vik.beans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dg")
public class DateGenrator 
{
	@Autowired
	LocalDate date;
	
	public void printDate()
	{
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		
		System.out.println("Today's Date is [ "+dd+"/"+mm+"/"+yy+"]");
	}
}
