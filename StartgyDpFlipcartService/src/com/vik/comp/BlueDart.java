package com.vik.comp;

// Rule => code should be close for modification
// Implemented by taking Final classes 
public final class BlueDart implements ICourier {

	@Override
	public String deiliver(int OrderId) 
	{
		return OrderId+" Order is Ready to Deliver by BlueDart serivice";
	}

}
