package com.siriuscom.training.OOP4;

public class Card
{
	private enum Suit
	{
		Spades, Hearts, Clubs, Diamonds
	}
	private final int rank;
	private final Suit suit;
	
	public Card(int rank, Suit suit)
	{
		this.rank = rank;
		this.suit = suit;
	}
}
