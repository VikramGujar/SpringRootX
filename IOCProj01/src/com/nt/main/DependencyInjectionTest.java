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
		//  - if it is well-formed and valid then creates in memory MetaDeta in JVM memory where the Application is running 
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext
				("C:/Users/vikra/OneDrive/Desktop/Spring_Core/IOCProj01/src/com/nt/cfgs/applicationContext.xml");
				/*
					Here we can give Both class level path and absolute path to FileSystemXmlApplicationContext
				*/
		
	
		
		//get target spring bean class obj ref
		WishMessageGenerator genrator = ctx.getBean("wmg", WishMessageGenerator.class);
		//invoke the b.method 
		
		String result = genrator.showWishMessage("Vikram");
		System.out.println("Result is : "+result);
		
		//close the IOC container
		ctx.close();
		
	}
}
