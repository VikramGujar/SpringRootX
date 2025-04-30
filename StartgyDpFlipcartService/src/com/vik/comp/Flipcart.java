package com.vik.comp;

import java.util.Random;

public class Flipcart 
{
	ICourier ic;

	public void setIc(ICourier ic) {
		this.ic = ic;
	}
	
	public String shopping(String item, double price)
	{
		Random rd = new Random();
		int id = rd.nextInt(10000,20000);
		
		String msg = ic.deiliver(id);
		
		return item+""+" with Price Rs. "+price+" and ID "+msg+"";
	}
}
