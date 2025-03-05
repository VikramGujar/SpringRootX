package com.vik.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.vik.sbeans.PayCardFinder;

public class CardFinderTest 
{

	public static void main(String[] args) 
	{
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext
				("src/com/vik/cnfg/ApplicationContext.xml");
		
		Object obj = ctx.getBean("pcf");
		PayCardFinder finder = (PayCardFinder) obj;
		
		String result = finder.findCard("Vikram");
		
		System.out.println(result);
		
	}

}
