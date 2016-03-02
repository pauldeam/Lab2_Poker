package pokerBase;

import java.util.ArrayList;

public class Hand {

	private ArrayList<Card> CardsInHand;
	private ArrayList<Card> BestCardsInHand;
	private HandScore HandScore;
	private boolean bScored = false;
	private boolean Flush;
	private boolean Straight;
	private boolean Ace;
	
	public Hand(){
		CardsInHand = new ArrayList<Card>();
		BestCardsInHand = new ArrayList<Card>();
	}

	public ArrayList<Card> getCardsInHand() {
		return CardsInHand;
	}

	public void setCardsInHand(ArrayList<Card> cardsInHand) {
		CardsInHand = cardsInHand;
	}

	public ArrayList<Card> getBestCardsInHand() {
		return BestCardsInHand;
	}

	public void setBestCardsInHand(ArrayList<Card> bestCardsInHand) {
		BestCardsInHand = bestCardsInHand;
	}

	public HandScore getHandScore() {
		return HandScore;
	}

	public void setHandScore(HandScore handScore) {
		HandScore = handScore;
	}
	
	public boolean isbScored() {
		return bScored;
	}

	public void setbScored(boolean bScored) {
		this.bScored = bScored;
	}

	public boolean isFlush() {
		return Flush;
	}

	public void setFlush(boolean flush) {
		Flush = flush;
	}

	public boolean isStraight() {
		return Straight;
	}

	public void setStraight(boolean straight) {
		Straight = straight;
	}

	public boolean isAce() {
		return Ace;
	}

	public void setAce(boolean ace) {
		Ace = ace;
	}

	// adds a card to your hand
	public Hand AddCardToHand(Card c){
		CardsInHand.add(c);
		return this;
	}
	
	// takes card from deck
	public Hand Draw(Deck d){
		CardsInHand.add(d.Draw());
		return this;
	}
	
	
}
