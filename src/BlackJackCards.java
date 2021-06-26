
public class BlackJackCards extends Card{
	public BlackJackCards(int c , Suit s) {
		super(c,s);
	}
	public int value() {
		if(isAce()) {
			return 1;
		}else if(faceValue >= 11 && faceValue <= 13) {
			return 10;
		}else {
			return faceValue;
		}
	}
	
	public boolean isAce() {
		return faceValue == 1;
	}
	
	public int minValue() {
		if(isAce()) {
			return 1;
		}else {
			return value();
		}
	}
	
	public int maxValue() {
		if(isAce()) {
			return 11;
		}else {
			return value();
		}
	}

}
