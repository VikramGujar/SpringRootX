package com.vik.sbeans;

import org.springframework.stereotype.Component;

@Component("laptop")
public final class Laptop implements ElectronicDevice 
{

	@Override
	public String charging() 
	{
		return "Laptop is Charging";
	}

}
