package com.functions;

import java.util.List;

public class Player {
	
	public int getThisRoundScore() {
		return thisRoundScore;
	}
	public void setThisRoundScore(int thisRoundScore) {
		this.thisRoundScore = thisRoundScore;
	}
	private List<Object> cardsAllocated;
	private String name;
	private String choice;
	private int score;
	private int thisRoundScore;
	
	public String getChoice() {
		return choice;
	}
	public void setChoice(String choice) {
		this.choice = choice;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Object> getCards() {
		return this.cardsAllocated;
	}
	public void addCards(List<Object> cardList)  {
		this.cardsAllocated = cardList;
	}
	public int getScore() {
		return this.score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}