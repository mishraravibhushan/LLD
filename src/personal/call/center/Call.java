package personal.call.center;

public class Call {
	/*
	 * Minimal rank of employee who can handle this call
	 */
	private Rank rank;
	/*
	 * Person is calling
	 */
	private Caller caller;
	
	/*
	 * Employee who is handling call
	 */
	public Employee handler;
	
	public Call(Caller c) {
		rank = Rank.Respondent;
		caller = c;
	}
	/*
	 * Set employee who is handling call
	 */
	public void setHandler(Employee e) {
		handler = e;
	}
	
	public void reply(String message) {
		
	}
	public Rank getRank() {
		return rank;
	}
	public void setRank(Rank r) {
		rank = r;
	}
	public Rank incrementRank() {
		return Rank.Director;
	}
	public void diconnect() {
		
	}
	

}
