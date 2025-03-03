package com.vik.sbeans;

import java.time.LocalDate;

public class DiscountCalculator 
{

	LocalDate date;
	double price;
	
	
	public void setDate(LocalDate date)
	{
		this.date = date;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public double calculateDiscount()
	{
		int day = date.getDayOfWeek().getValue();
		
		if(day>5)
		{
			return price - (price*0.1);
		}else
		{
			return price - (price*0.2);
		}
	}
}
