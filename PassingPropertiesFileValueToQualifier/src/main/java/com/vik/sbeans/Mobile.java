package com.vik.sbeans;

import org.springframework.stereotype.Component;

@Component("mobile")
public final class Mobile implements ElectronicDevice 
{

	@Override
	public String charging() 
	{
		return "Mobile is Charging";
	}

}
