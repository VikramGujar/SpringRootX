package com.vik.factory;

import com.vik.comp.BlueDart;
import com.vik.comp.DTDC;
import com.vik.comp.Flipcart;
import com.vik.comp.ICourier;

public class FlipcartFactory 
{
	public static Flipcart getInstanceOf(String courierType)
	{
		ICourier courier = null;
		
		if(courierType.equalsIgnoreCase("dtdc"))
		{
			courier = new DTDC();
		}else if(courierType.equalsIgnoreCase("bluedart"))
		{
			courier = new BlueDart();
		}else {
			throw new IllegalArgumentException();
		}
		
		Flipcart fbkt = new Flipcart();
		fbkt.setIc(courier);
		return fbkt;
	}
}
