package com.vik.sbeans;

import org.springframework.stereotype.Component;

@Component("rcb")
public final class RCB implements IIpl {

	@Override
	public String win() 
	{
		return "RCB Won The IPL";
	}

}
