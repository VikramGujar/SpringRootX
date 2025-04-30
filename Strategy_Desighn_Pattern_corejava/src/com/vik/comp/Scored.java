package com.vik.comp;

import java.util.Random;

public final class Scored 
{
	// Rule No.1 Prefer Composition [ HAS-A Relation ] 
	// Over Inheritance [ IS-A Relation ]
	IPlayer iPlayer;	// HAS-A property
	
	
	public void setPlayer(IPlayer player) {
		this.iPlayer = player;
	}
	
	
	
	public String scoreCard()
	{
		Random r = new Random();
		int score = r.nextInt(100);
		
		return iPlayer.play(score);
	}

	
	
	
}
