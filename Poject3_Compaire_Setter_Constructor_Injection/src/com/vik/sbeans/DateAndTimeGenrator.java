package com.vik.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTimeGenrator 
{
	LocalTime localTime;	// HAS-A Property
	LocalDate localDate;	// HAS-A Property
	
	
	public DateAndTimeGenrator(LocalTime localTime, LocalDate localDate) 
	{
		System.out.println("WishMassageGenrator() [ Two Param Constructor ]");
		this.localTime = localTime;
		this.localDate = localDate;
	}
	
	public void setLocalTime(LocalTime localTime) 
	{
		System.out.println("WishMassageGenrator.setLocalTime()");
		this.localTime = localTime;
	}
	public void setLocalDate(LocalDate localDate) 
	{
		System.out.println("WishMassageGenrator.setLocalDate()");
		this.localDate = localDate;
	}
	
	public String showMassage(String user)
	{
		int hour = localTime.getHour();
		int minute = localTime.getMinute();
		int dayOfMonth = localDate.getDayOfMonth();
		int month = localDate.getMonthValue();
		int year = localDate.getYear();
		
		return "Hello "+user+"! Today's Date is [ "+dayOfMonth+"/"+month+"/"+year+""
				+ " ] and Time is [ "+hour+" : "+minute+" ]";
	}
}
