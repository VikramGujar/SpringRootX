package com.vik.comp;

public class BlueDart implements ICourier {

	@Override
	public String deiliver(int OrderId) 
	{
		return OrderId+" Order is Ready to Deliver by BlueDart serivice";
	}

}
