package com.vik.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vik.beans.WishMassageGenrator;

public class InjectionMain 
{

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		WishMassageGenrator wmg = (WishMassageGenrator) ctx.getBean("wmg");
		System.out.println(wmg.Massage());
		ctx.close();
	}

}
