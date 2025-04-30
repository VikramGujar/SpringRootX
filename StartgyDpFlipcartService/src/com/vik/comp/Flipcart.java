package com.vik.comp;

import java.util.Random;

public class Flipcart 
{
	// Rule => Prefer Composition over Inheritance
	// Implemented by taking ICourier as HAS-A Relation
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
