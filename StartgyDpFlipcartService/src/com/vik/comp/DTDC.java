package com.vik.comp;

public class DTDC implements ICourier {

	@Override
	public String deiliver(int OrderId) 
	{
		return OrderId+" Order is Ready to Deliver by DTDC serivice";
	}

}
