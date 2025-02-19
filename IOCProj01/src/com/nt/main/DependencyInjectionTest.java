package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest 
{
	public static void main(String[] args)
	{
		//create IOC Container
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("C:/Users/vikra/OneDrive/Desktop/Spring_Core/IOCProj01/src/com/nt/cfgs/applicationContext.xml");
		
		//get target spring bean class obj ref
		WishMessageGenerator genrator = ctx.getBean("wmg", WishMessageGenerator.class);
		//invoke the b.method 
		
		String result = genrator.showWishMessage("Vikram");
		System.out.println("Result is : "+result);
		
		//close the IOC container
		ctx.close();
		
	}
}
