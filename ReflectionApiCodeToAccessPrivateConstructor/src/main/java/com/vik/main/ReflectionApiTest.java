package com.vik.main;

import java.lang.reflect.Constructor;

public class ReflectionApiTest 
{

	public static void main(String[] args)throws Exception
	{
		// Load the Class
		Class clazz = Class.forName("com.vik.bean.PrivateConstructorClass");
		
		// Get all Constructors of the loaded class 
		Constructor cons[] = clazz.getDeclaredConstructors();
		
		// Get access to private constructor 
		cons[0].setAccessible(true);
		
		// Create Objects
		Object obj1 = cons[0].newInstance();
		Object obj2 = cons[0].newInstance();

		// Display result
		// Class of the Objects 
		System.out.println("Object one class "+obj1.getClass());
		System.out.println("Object two class "+obj2.getClass());
		
		// Proving this are two different objects of same class
		System.out.println("Object one HashCode = "+obj1.hashCode());
		System.out.println("Object Two HashCode = "+obj2.hashCode());
	}

}
