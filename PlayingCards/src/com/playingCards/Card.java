package com.playingCards;

public class Card {
	private final int number;
	private final int value;
	private final String series;
	private final String name;
	
	public Card(int number, int value, String series, String name) {
		this.number = number;
		this.value = value;
		this.series = series;
		this.name = name;
	}
	public int getNo() {
		return number;
	}
	public int getDeger() {
		return value;
	}
	public String getSeri() {
		return series;
	}
	public String getISim() {
		return name;
	}
	@Override
	public String toString() {
		return series + " " + name + "\nValue: " + value + "\n";
	}

}

