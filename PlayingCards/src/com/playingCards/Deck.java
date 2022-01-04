package com.playingCards;

import java.util.Random;

public class Deck {
	private final String[] series = {"Hearts", "Diamonds", "Clubs", "Spades"};
	private final String[] names = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	private int index;
	private Card[] cards;
	private int top;
	
	public Deck() {
		cards = new Card[52];
		index = 0;
		top = 0;
		
		for(int s = 0; s < series.length; s++) { // creates a deck
			for(int n = 0; n < names.length; n++) {
				int value = n > 9 ? 10 : n + 1; // The values ​​of J,Q and K are 10
				cards[index] = new Card(index, value, series[s], names[n]);
				index++;
			}
		}
	}
	
	public Card showCard() { // gives the top card
		return cards[top++];
	}
	
	public void mixer(int period) { // does the mixing
		Card temp;
		Random r = new Random();
		for(int i = 0; i < period; i++) {
			int x = r.nextInt(52);
			int y = r.nextInt(52);
			
			temp = cards[x];
			cards[x] = cards[y];
			cards[y] = temp;
		}
	}
	
	public void print() { // prints to the screen
		for(int i = 0; i < cards.length; i++) {
			System.out.println(cards[i]);
		}
	}
}
