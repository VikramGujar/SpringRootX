package com.vik.comp;

public class DTDC implements ICourier
{

	@Override
	public String deliver(int oid) {
		
		return oid+" Order item kept for delevery by DTDC courier service";
	}

}
