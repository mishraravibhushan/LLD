import java.util.ArrayList;

public class BlackHand extends Hand<BlackJackCards>{
	
	public int score() {
		ArrayList<Integer> scores = possibleScore();
		int maxUnder = Integer.MIN_VALUE;
		int minOver = Integer.MAX_VALUE;
		for(int score : scores) {
			if(score > 21 && score < minOver) {
				minOver = score;
			}else if (score < 21 && score > maxUnder) {
				maxUnder = score;
			}
		}
		return maxUnder == Integer.MIN_VALUE ? minOver : maxUnder;
	}
	private ArrayList<Integer> possibleScore(){
		return new ArrayList<Integer>();
	}
}
