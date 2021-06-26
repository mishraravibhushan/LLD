package personal.call.center;

public enum Rank {
	Respondent(0),
	Manager(1),
	Director(2);
	
	public int value ; 
	Rank(int val) {
		value = val;
	}
	public int getValue() {
		return value;
	}

}
