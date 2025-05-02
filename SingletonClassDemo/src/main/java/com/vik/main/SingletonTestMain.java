package com.vik.main;

import com.vik.bean.SingletonClass;

public class SingletonTestMain 
{

	public static void main(String[] args) 
	{
		SingletonClass sltc1 = SingletonClass.getInstance();
		SingletonClass sltc2 = SingletonClass.getInstance();
		
		System.out.println("Obj1 = Obj2 ? "+sltc1.equals(sltc2));
		System.err.println(sltc1.hashCode());
		System.err.println(sltc2.hashCode());
	}

}
