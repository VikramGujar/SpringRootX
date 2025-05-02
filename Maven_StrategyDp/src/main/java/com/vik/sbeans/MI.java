package com.vik.sbeans;

import org.springframework.stereotype.Component;

@Component("mi")
public final class MI implements IIpl {

	@Override
	public String win() 
	{
		return "MI Won The IPL";
	}

}
