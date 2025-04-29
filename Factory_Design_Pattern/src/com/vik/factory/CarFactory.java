package com.vik.factory;

import com.vik.comp.Fast;
import com.vik.comp.Fastest;
import com.vik.comp.ICar;
import com.vik.comp.Slow;

public class CarFactory 
{
	public ICar getInstanceOf(String carType)
	{
		if(carType.equalsIgnoreCase("slow"))
		{
			return new Slow();
		}else if(carType.equalsIgnoreCase("fast"))
		{
			return new Fast();
		}else if(carType.equalsIgnoreCase("fastest"))
		{
			return new Fastest();
		}else {
			throw new IllegalArgumentException("Illegal Car Type");
		}
	}
}
