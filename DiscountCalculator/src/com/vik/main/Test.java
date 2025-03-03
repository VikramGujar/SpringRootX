package com.vik.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.vik.sbeans.DiscountCalculator;

public class Test 
{

	public static void main(String[] args) 
	{
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/vik/confg/ApplicationContext.xml");

		DiscountCalculator disc = ctx.getBean("dc",DiscountCalculator.class);
		
		System.out.println("Your Disscounted price is :"+disc.calculateDiscount());
	}

}
