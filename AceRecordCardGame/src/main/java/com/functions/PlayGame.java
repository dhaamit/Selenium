package com.functions;

import com.logger.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PlayGame {
	public int noOfPlayers;
	public int noOfRounds;
	public int cardsPerPlayer;
	public int totalCards;
	public int totalInGameCards;
	public Integer[] arrObj;
	public Records record;
	public ArrayList<Player> players;
	private static Logger log = LogManager.getLogger(Log4J.class.getName());
	public double MAXMATCHES;
	public double MAXHS;
	public double MAXRUNS;
	public double MAXHUNDREDS;
	public double MAXFIFTIES;
	public double MAXCATCHES;
	public double MAXWICKETS;
	public double MAXFIVEWICKETS;
	public double score1;
	public double score2;

	public void setPlayer(Player player) {
		this.players.add(player);
	}

	@SuppressWarnings("unchecked")
	public PlayGame(int playerNumbers) throws Throwable {
		this.noOfPlayers = playerNumbers;

		Records record = new Records();
		this.record = record;
		this.totalCards = this.record.getRecordCount();
		this.cardsPerPlayer = 8;
		this.totalInGameCards = this.cardsPerPlayer * this.noOfPlayers;
		this.noOfRounds = this.cardsPerPlayer;

		RandomSeries rf = new RandomSeries();

		LinkedHashSet<Integer> randomLHS = new LinkedHashSet<Integer>();
		randomLHS = rf.generateRandomSeries(1, this.totalCards);
		this.arrObj = new Integer[randomLHS.size()];
		this.arrObj = randomLHS.toArray(arrObj);
		setMaxValues();

		log.info("Ramdom Series : " + randomLHS);
		log.info(arrObj[3]);

	}

	public void setMaxValues() throws Throwable {
		this.MAXMATCHES = record.getMaxValue("Matches");
		this.MAXHS = record.getMaxValue("HighestScore");
		this.MAXRUNS = record.getMaxValue("Runs");
		this.MAXHUNDREDS = record.getMaxValue("Hundreds");
		this.MAXFIFTIES = record.getMaxValue("Fifties");
		this.MAXCATCHES = record.getMaxValue("Catches");
		this.MAXWICKETS = record.getMaxValue("Wickets");
		this.MAXFIVEWICKETS = record.getMaxValue("FiveWickets");
	}


	public void allocateCards(Player pl1, Player pl2) throws Throwable {

		log.info("configuring 2 players and distributing cards..");
		List<Object> player1 = new ArrayList<Object>();
		List<Object> player2 = new ArrayList<Object>();
		for (int i = 0; i < this.totalInGameCards; i++) {
			player1.add(record.getRecordListFromDB(this.arrObj[i]));
			i = i + 1;
			player2.add(record.getRecordListFromDB(this.arrObj[i]));
		}
		pl1.addCards(player1);
		pl2.addCards(player2);
	}

	public void allocateCards(Player pl1, Player pl2, Player pl3) throws Throwable {
		System.out.println("configuring 3 players and distibuting cards..");
		List<Object> player1 = new ArrayList<Object>();
		List<Object> player2 = new ArrayList<Object>();
		List<Object> player3 = new ArrayList<Object>();
		for (int i = 0; i < this.totalInGameCards; i++) {
			player1.add(this.record.getRecordListFromDB(this.arrObj[i]));
			i = i + 1;
			player2.add(this.record.getRecordListFromDB(this.arrObj[i]));
			i = i + 1;
			player3.add(this.record.getRecordListFromDB(this.arrObj[i]));
		}
		pl1.addCards(player1);
		pl2.addCards(player2);
		pl3.addCards(player3);
	}

	public void allocateCards(Player pl1, Player pl2, Player pl3, Player pl4) throws Throwable {
		System.out.println("configuring 4 players and distibuting cards..");
		List<Object> player1 = new ArrayList<Object>();
		List<Object> player2 = new ArrayList<Object>();
		List<Object> player3 = new ArrayList<Object>();
		List<Object> player4 = new ArrayList<Object>();
		for (int i = 0; i < this.totalInGameCards; i++) {
			player1.add(record.getRecordListFromDB(arrObj[i]));
			i = i + 1;
			player2.add(record.getRecordListFromDB(arrObj[i]));
			i = i + 1;
			player3.add(record.getRecordListFromDB(arrObj[i]));
			i = i + 1;
			player4.add(record.getRecordListFromDB(arrObj[i]));
		}
		pl1.addCards(player1);
		pl2.addCards(player2);
		pl3.addCards(player3);
		pl4.addCards(player4);
	}

	public void playRound(int p1CardNo, int p2CardNo, Player pl1, Player pl2, int myTurn, String prChoice) throws Throwable {
		String choice = null;
		if (myTurn == 1) {
			log.info("Your Turn ....................");
			choice = prChoice;
			log.info("Choice for this Round by " + pl1.getName() + " is : " + choice);
			pl1.setChoice(choice);
			pl2.setChoice(choice);
		} else {
			log.info(pl2.getName() + "'s Turn ....................");
			choice = autoplayChoiceDecider(pl2, p2CardNo);
			log.info("Choice for this Round by " + pl2.getName() + " is : " + choice);
			pl1.setChoice(choice);
			pl2.setChoice(choice);
		}

		Card card1 = new Card();
		Card card2 = new Card();
		Object[] arrList = getObjArrayCard(pl1, p1CardNo);
		card1 = arrayToRecordCard(arrList);
		arrList = getObjArrayCard(pl2, p2CardNo);
		card2 = arrayToRecordCard(arrList);
		compareCardsAndGetScore(card1, card2, choice);

		log.debug("Score for this round :: " + pl1.getName() + "=" + this.score1 + " :: " + pl2.getName() + "=" + this.score2);
		
		pl1.setThisRoundScore((int) Math.round(this.score1));
		pl2.setThisRoundScore((int) Math.round(this.score2));
		pl1.setScore(pl1.getScore() + (int) Math.round(this.score1));
		pl2.setScore(pl2.getScore() + (int) Math.round(this.score2));
		this.score1 = 0.0;
		this.score2 = 0.0;
	}

	public String autoplayChoiceDecider(Player pl, int cardNumber) {
		String choice = "";
		Object[] arrList = getObjArrayCard(pl, cardNumber);
		Card currentCard = new Card();
		currentCard = arrayToRecordCard(arrList);
		
		for (int z=100;z>0;z=z-5)
		{
			if (((currentCard.getcRuns()/MAXRUNS) *100)>= z) {
				choice = "Runs";break;
			} else if (((currentCard.getcWickets()/MAXWICKETS)*100)>= z) {
				choice = "Wickets";break;
			} else if (((currentCard.getcCenturies()/MAXHUNDREDS)*100)>= z) {
				choice = "Hundreds";break;
			} else if (((currentCard.getcFiveWickets()/MAXFIVEWICKETS)*100) >= z) {
				choice = "Five Wickets";break;
			} else if (((currentCard.getcFifties()/MAXFIFTIES)*100) >= z) {
					choice = "Fifties";break;
			} else if (((currentCard.getcHighestScore()/MAXHS)*100) >=z) {
				choice = "Highest Score";break;
			} else if (((currentCard.getcCatches()/MAXCATCHES)*100) >=z) {
				choice = "Catches";break;
			} else if (((currentCard.getcMatches()/MAXMATCHES)*100) >= z) {
				choice = "Matches";break;
			} 
		}
		return choice;
	}

	public void compareCardsAndGetScore(Card card1, Card card2, String choice) {
		if (choice.equalsIgnoreCase("Matches")) {
			this.score1 = (card1.getcMatches()) * (1 / this.MAXMATCHES) * 100;
			this.score2 = (card2.getcMatches()) * (1 / this.MAXMATCHES) * 100;
		} else if (choice.equalsIgnoreCase("Catches")) {
			this.score1 = (card1.getcCatches()) * (1 / this.MAXCATCHES) * 100;
			this.score2 = (card2.getcCatches()) * (1 / this.MAXCATCHES) * 100;
		} else if (choice.equalsIgnoreCase("Highest Score")) {
			this.score1 = (card1.getcHighestScore()) * (1 / this.MAXHS) * 100;
			this.score2 = (card2.getcHighestScore()) * (1 / this.MAXHS) * 100;
		} else if (choice.equalsIgnoreCase("Runs")) {
			this.score1 = (card1.getcRuns()) * (1 / this.MAXRUNS) * 100;
			this.score2 = (card2.getcRuns()) * (1 / this.MAXRUNS) * 100;
		} else if (choice.equalsIgnoreCase("Wickets")) {
			this.score1 = (card1.getcWickets()) * (1 / this.MAXWICKETS) * 100;
			this.score2 = (card2.getcWickets()) * (1 / this.MAXWICKETS) * 100;
		} else if (choice.equalsIgnoreCase("Five Wickets")) {
			this.score1 = (card1.getcFiveWickets()) * (1 / this.MAXFIVEWICKETS) * 100;
			this.score2 = (card2.getcFiveWickets()) * (1 / this.MAXFIVEWICKETS) * 100;
		} else if (choice.equalsIgnoreCase("Hundreds")) {
			this.score1 = (card1.getcCenturies()) * (1 / this.MAXHUNDREDS) * 100;
			this.score2 = (card2.getcCenturies()) * (1 / this.MAXHUNDREDS) * 100;
		} else if (choice.equalsIgnoreCase("Fifties")) {
			this.score1 = (card1.getcFifties()) * (1 / this.MAXFIFTIES) * 100;
			this.score2 = (card2.getcFifties()) * (1 / this.MAXFIFTIES) * 100;
		} else {
			System.out.println("Wrong Choice..");
			this.score1 = 0;
			this.score2 = 0;
		}
		//System.out.println(this.score1 + " : " + this.score2);
	}

	@SuppressWarnings("unchecked")
	public Object[] getObjArrayCard(Player pl, int cardNumber) {
		List<Object> localList = new ArrayList<Object>();
		Object[] arrList;
		localList = (List<Object>) pl.getCards().get(cardNumber);
		arrList = localList.toArray();
		// System.out.println(arrList);
		return arrList;
	}

	public Card arrayToRecordCard(Object[] arr) {
		Card card = new Card();
		for (int i = 0; i < arr.length; i++) {
			switch (i) {
			case 0:
				card.setcIndex((Integer) arr[i]);
				break;
			case 1:
				card.setcName((String) arr[i]);
				break;
			case 2:
				card.setcMatches((Integer) arr[i]);
				break;
			case 3:
				card.setcHighestScore((Integer) arr[i]);
				break;
			case 4:
				card.setcRuns((Integer) arr[i]);
				break;
			case 5:
				card.setcCenturies((Integer) arr[i]);
				break;
			case 6:
				card.setcFifties((Integer) arr[i]);
				break;
			case 7:
				card.setcCatches((Integer) arr[i]);
				break;
			case 8:
				card.setcWickets((Integer) arr[i]);
				break;
			case 9:
				card.setcFiveWickets((Integer) arr[i]);
				break;
			default:
				System.out.println("Invalid array =" + arr);
			}
		}
		return card;
	}

	public void showScore(Player pl) {
		System.out.println("    " + pl.getName() + "   Score : " + pl.getScore());
	}

	public void showCard(Player pl, int index) {
		System.out
				.println("Show Card number " + (index + 1) + " for " + pl.getName() + " : " + pl.getCards().get(index));
	}
}