import java.util.ArrayList;

public class Deck <T extends Card> {
	private ArrayList<T> cards;
	private int dealtIndex = 0;
	
	public void setDeckOfCards(ArrayList<T> deckCards) {
		
	}
	public void shuffle() {
		
	}
	public int remainingCards() {
		return cards.size() - dealtIndex;
	}
	
	public T[] dealHand(int number) {
		T[] ts = (T[])new Card[5];
		return ts;
	}
	public void dealCard() {
		
	}
	
}
