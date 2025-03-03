package com.vik.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.vik.sbeans.wishMassageGenrator;

public class DependancyTest 
{

	public static void main(String[] args) 
	{
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext
				("C:/Users/vikra/OneDrive/Desktop/Spring_Core/IOCProj2/src/com/vik/config/applicationContex.xml");
				
		wishMassageGenrator genrator = ctx.getBean("wmg", wishMassageGenrator.class);
		String result = genrator.showMassage("Vikram");
		System.out.println(result);
		ctx.close();
	}

}
