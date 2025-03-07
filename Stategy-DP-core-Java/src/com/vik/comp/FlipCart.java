package com.vik.comp;

import java.util.Arrays;
import java.util.Random;

public class FlipCart 
{
	private ICourier courier;
	
	public void setCourier(ICourier courier)
	{
		this.courier = courier;
	}
	
	public String shopping(String items[], double prices[])
	{
		double billAount = 0;
		
		for(double price : prices)
		{
			billAount += price;
		}
		
		int oid = new Random().nextInt(1000);
		
		String msg = courier.deliver(oid);
		
		
		return Arrays.toString(items)+" Items with bill amount "+billAount+"----->"+msg;
	}
}
