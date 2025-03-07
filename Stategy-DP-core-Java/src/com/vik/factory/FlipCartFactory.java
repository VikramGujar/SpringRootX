package com.vik.factory;

import com.vik.comp.BlueCart;
import com.vik.comp.DTDC;
import com.vik.comp.FlipCart;
import com.vik.comp.ICourier;

public class FlipCartFactory 
{
	public static FlipCart getInstance(String courcerType)
	{
		ICourier courier = null;
		
		if(courcerType.equalsIgnoreCase("dtdc"))
		{
			courier = new DTDC();
		}else if(courcerType.equalsIgnoreCase("bluecart"))
		{
			courier = new BlueCart();
		}else {
			throw new IllegalArgumentException("Invalid Courier Type");
		}
		
		FlipCart fc = new FlipCart();
		fc.setCourier(courier);
		
		return fc;
	}
}
