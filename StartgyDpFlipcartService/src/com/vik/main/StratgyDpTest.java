package com.vik.main;

import com.vik.comp.Flipcart;
import com.vik.factory.FlipcartFactory;

public class StratgyDpTest 
{

	public static void main(String[] args) 
	{
		Flipcart fc = FlipcartFactory.getInstanceOf("bluedart");
		String msg = fc.shopping("Car", 1000000.00);
		System.out.println(msg);

	}

}
