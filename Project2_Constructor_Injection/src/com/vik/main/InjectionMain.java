package com.vik.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vik.sbeans.WishMassageGenrator;

public class InjectionMain 
{

	public static void main(String[] args) 
	{
		System.out.println("InjectionMain.main() [ Started ]");
		
		// IOC Container Creation
		System.out.println("IOC Container Creation started ");
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		System.out.println("IOC Container creation completed");
		
		// Get the spring bean object from container
		Object obj = ctx.getBean("wmg");
		
		// Type casting of the object Generic to Specific
		WishMassageGenrator genrator = (WishMassageGenrator) obj;
		
		// Calling business method and storing result 
		String result = genrator.showMassage("Vikram");
		
		// Printing the result
		System.out.println(result);
		
		// Closing the container
		ctx.close();
		
		System.out.println("InjectionMain.main() [ Ended ]");
	}

}
