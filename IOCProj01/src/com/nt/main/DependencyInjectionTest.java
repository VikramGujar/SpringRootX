package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest 
{
	// 1. When we RUN the program the control will first comes to Main method
	public static void main(String[] args)
	{
		// 2. Program will start running from main method 
		
		
		// 3. Here IOC container will be created
		
		// 4. Here loads spring bean cfgs file from specified location
		//  - Checks weather it is well formed or not and valid or not
		//  - if it is well-formed and valid then creates in memory MetaDeta 
		//  - in JVM memory where the Application is running 
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext
				("C:/Users/vikra/OneDrive/Desktop/Spring_Core/IOCProj01/src/com/nt/cfgs/applicationContext.xml");
				/*
					Here we can give Both class level path and absolute path to FileSystemXmlApplicationContext
				*/
		
		// IOC Container creation is completed
		
	
		
		// 14. get target spring bean class obj ref
		Object obj = ctx.getBean("wmg");
		
		// 16. Object casted to WishMessageGenerator type
		WishMessageGenerator genrator = (WishMessageGenerator) obj;
		
		// 17. invoke the business method on WishMessageGenerator object
		String result = genrator.showWishMessage("Vikram");
		// 18. Store the result returned by business method showWishMessage 
		
		// 23. Print the result 
		System.out.println("Result is : "+result);
		
		// 24. close the IOC container
		//   - As part of IOC Container closing, 
		//   - All Spring bean class objects will be destroyed 
		ctx.close();
		
	}	// 25. End of main method and End of the application execution
}
