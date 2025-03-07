package com.vik.test;

import com.vik.comp.FlipCart;
import com.vik.factory.FlipCartFactory;

public class StatecyPatternTest 
{

	public static void main(String[] args) 
	{
		FlipCart fc = FlipCartFactory.getInstance("bluecart");
		
		String resultMSG = fc.shopping(new String[] {"Shirt","Color"}, new double[] {2000, 1000});
		
		System.out.println(resultMSG);

	}

}
