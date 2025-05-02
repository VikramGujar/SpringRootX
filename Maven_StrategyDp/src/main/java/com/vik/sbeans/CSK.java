package com.vik.sbeans;

import org.springframework.stereotype.Component;

@Component("csk")
public final class CSK implements IIpl {

	@Override
	public String win() 
	{
		return "CSK Won The IPL";
	}

}
