package pokerEnums;

public enum eSuit {

	SPADES(1),
	HEARTS(2),
	CLUBS(3),
	DIAMONDS(4);
	
	private int iSuitNbr;

	private eSuit(int iSuitNbr) {
		this.iSuitNbr = iSuitNbr;
	}

	public int getiSuitNbr() {
		return iSuitNbr;
	}
	
}
