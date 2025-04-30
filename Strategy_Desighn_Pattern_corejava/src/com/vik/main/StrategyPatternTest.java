package com.vik.main;


import com.vik.comp.Scored;
import com.vik.factory.PlayerFactory;

public class StrategyPatternTest 
{
	public static void main(String[] args) 
	{
		Scored player = PlayerFactory.getPlayer("doni");
		String msg = player.scoreCard();
		System.out.println(msg);
		
	}
}
