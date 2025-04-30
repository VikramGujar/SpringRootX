package com.vik.factory;

import com.vik.comp.DeVilliers;
import com.vik.comp.Doni;
import com.vik.comp.IPlayer;
import com.vik.comp.Rohit;
import com.vik.comp.Virat;

public class PlayerFactory 
{
	public static IPlayer getPlayer(String playerName)
	{
		if(playerName.equalsIgnoreCase("virat"))
		{
			return new Virat();
		}else if(playerName.equalsIgnoreCase("devilliers"))
		{
			return new DeVilliers();
		}else if(playerName.equalsIgnoreCase("doni"))
		{
			return new Doni();
		}else if(playerName.equalsIgnoreCase("rohit"))
		{
			return new Rohit();
		}else 
		{
			throw new IllegalArgumentException();
		}
	}
}
