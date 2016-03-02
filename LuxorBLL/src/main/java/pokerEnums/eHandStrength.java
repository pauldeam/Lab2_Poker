package pokerEnums;

public enum eHandStrength {

	RoyalFlush(100, "isHandRoyalFlush"){
		public String toString(){	//toString() method is for user readability
			return "Royal Flush";
		}
	},
	StraightFlush(90, "isStraightFlush"){
		public String toString(){
			return "Straight Flush";
		}
	},
	FourOfAKind(80, "isHandFourOfAKind"){
		public String toString(){
			return "Four Of A Kind";
		}
	},
	FullHouse(70, "isHandFullHouse"){
		public String toString(){
			return "Full House";
		}
	},
	Flush(60, "isHandFlush"){
		public String toString(){
			return "Flush";
		}
	},
	Straight(50, "isHandStraight"){
		public String toString(){
			return "Straight";
		}
	},
	ThreeOfAKind(40, "isHandThreeOfAKind"){
		public String toString(){
			return "Three Of A Kind";
		}
	},
	TwoPair(30, "isHandTwoPair"){
		public String toString(){
			return "Two Pair";
		}
	},
	Pair(20, "isHandPair"){
		public String toString(){
			return "Pair";
		}
	},
	HighCard(10, "isHandHighCard"){
		public String toString(){
			return "High Card";
		}
	};
	
	private int iHandStregth;
	private String strEvalMethod;
	
	public int getiHandStregth() {
		return iHandStregth;
	}

	public String getStrEvalMethod() {
		return strEvalMethod;
	}

	//constructor
	private eHandStrength(int iHandStregth, String strEvalMethod) {
		this.iHandStregth = iHandStregth;
		this.strEvalMethod = strEvalMethod;
	}
}
