package online.book.reading;

public class User {
	
	private int userID;
	private String details;
	private int accountType;
	
	public void renewMemberShip() {
		
	}
	
	public User(int id,String details,int accountType) {
		userID = id;
		this.details = details;
		this.accountType = accountType;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getAccountType() {
		return accountType;
	}

	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}

}
