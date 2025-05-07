package com.vik.sbeans;

import org.springframework.stereotype.Component;

@Component("watch")
public final class Watch implements ElectronicDevice 
{

	@Override
	public String charging() 
	{
		return "Watch is Charging";
	}

}
