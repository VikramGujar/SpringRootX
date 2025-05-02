package com.vik.bean;

public class SingletonClass 
{
	private static SingletonClass INSTANCE;
	
	private SingletonClass() 
	{
		System.out.println("SingletonClass.SingletonClass()");
	}
	
	public static SingletonClass getInstance()
	{
		if(INSTANCE==null)
		{
			INSTANCE = new SingletonClass();
		}
		return INSTANCE;
		
	}
	
	public void printingClassname() 
	{
		System.out.println("I am Singleton class");
	}
	
}
