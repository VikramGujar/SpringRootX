package com.vik.main;


import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.vik.sbeans.SeassionFinder;

public class DependencyInjectionTest 
{

	public static void main(String[] args) 
	{
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext
				("C:/Users/vikra/OneDrive/Desktop/Spring_Core/IOCProj03/src/com/vik/confg/applicationContext.xml");
		
		SeassionFinder sf = ctx.getBean("sf", SeassionFinder.class);
		
		String result = sf.findSeassion();
		
		System.out.println(result);
		
		ctx.close();

	}

}
