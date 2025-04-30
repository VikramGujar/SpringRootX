package com.vik.factory;

import com.vik.comp.DeVilliers;
import com.vik.comp.Doni;
import com.vik.comp.IPlayer;
import com.vik.comp.Rohit;
import com.vik.comp.Scored;
import com.vik.comp.Virat;

public class PlayerFactory 
{
	public static Scored getPlayer(String playerName)
	{
		IPlayer player = null;
		
		if(playerName.equalsIgnoreCase("virat"))
		{
			player = new Virat();
		}else if(playerName.equalsIgnoreCase("devilliers"))
		{
			player = new DeVilliers();
		}else if(playerName.equalsIgnoreCase("doni"))
		{
			player =  new Doni();
		}else if(playerName.equalsIgnoreCase("rohit"))
		{
			player = new Rohit();
		}else 
		{
			throw new IllegalArgumentException();
		}
		
		Scored scr = new Scored();
		scr.setPlayer(player);
		return scr;
	}
}
