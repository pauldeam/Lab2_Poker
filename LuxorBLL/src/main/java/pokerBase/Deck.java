package pokerBase;

import java.util.ArrayList;

import java.util.Collections;

import pokerEnums.eRank;
import pokerEnums.eSuit;
/**
 * 
 * @author Paul Deamer
 *
 */
public class Deck {

	/**
	 * 
	 */
	private ArrayList<Card> deckCards = new ArrayList<Card>();
	/**
	 * No arg constructor for deck, will return shuffled deck of 52 cards
	 */
	public Deck(){	
		//Create an ArrayList of Cards, and add each card
		for (short i = 0; i <= 3; i++){
			eSuit SuitValue = eSuit.values()[i];
			for (short j = 0; j <= 12; j++){
				eRank RankValue = eRank.values()[j];
				Card NewCard = new Card(RankValue, SuitValue, (13 * i) + j + 1);
				deckCards.add(NewCard);
			}
		}
		
		Collections.shuffle(deckCards);
	}
	
	public Card Draw(){ 
		return deckCards.remove(0);
	}
	
	
}
