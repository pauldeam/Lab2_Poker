package pokerBase;

import java.util.Comparator;

import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Card implements Comparable{ 

	private eRank eRank;
	private eSuit eSuit;
	private int iCardNbr;
	
	public Card(pokerEnums.eRank eRank, pokerEnums.eSuit eSuit, int iCardNbr) {
		super();
		this.eRank = eRank;
		this.eSuit = eSuit;
		this.iCardNbr = iCardNbr;
	}

	public eRank geteRank() {
		return eRank;
	}


	public eSuit geteSuit() {
		return eSuit;
	}


	public int getiCardNbr() {
		return iCardNbr;
	}


//	public static Comparator<Card> CardRank = new Comparator<Card>();
//		public int compare(Card c1, Card c2)
//		{
//			int Cno1 = c1.geteRank().getiRankNbr();
//			int Cno2 = c2.geteRank().getiRankNbr();
//			return Cno2 - Cno1;
//		}
	
	
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return c.eRank.compareTo(this.eRank);
	}
		
	
}
