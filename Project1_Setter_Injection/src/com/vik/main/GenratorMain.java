package com.vik.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.vik.beans.WishMassageGenrator;

public class GenratorMain 
{

	public static void main(String[] args) 
	{
		System.out.println("Main mtheod started");
		// Creating IOC Container 
		FileSystemXmlApplicationContext ctx = new 
				FileSystemXmlApplicationContext("src/com/vik/configration/ApplicationContext.xml");
		
		// Get the object from container
		// This method has generic return type
		Object obj = ctx.getBean("wmg");
		
		// Type cast object to class object
		WishMassageGenrator genrator = (WishMassageGenrator) obj;
		
		// Call the business method and Store result
		String result = genrator.showWishMassage("Vikram");
		
		// Print the result
		System.out.println(result);
		ctx.close();
		System.out.println("Main method ended");
	}

}
