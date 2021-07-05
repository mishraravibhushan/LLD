package chat.server;

import java.util.HashMap;

public class UserManager {
	/*
	 * UserManager serves as a central place for user actions
	 * 
	 */
	private static UserManager instance;
	
	/*
	 * maps from a user if to a user
	 */
	private HashMap<Integer, User> userById;
	
	/*
	 * maps from an account name to a user
	 */
	private HashMap<String,User> userByAccountName;
	
	/*
	 * maps from the user id to an online user
	 */
	private HashMap<Integer,User> onlineUsers;
	
	public static UserManager getInstance() {
		if(instance == null) {
			instance = new UserManager();
		}
		return instance;
	}
	
	public void addUser(User fromUser,String toAccountName) {
		
	}
	public void approvedAddRequest(AddRequest req) {
		
	}
	public void rejectAddRequest(AddRequest req) {
		
	}
	public void userSignedOn(String accountName) {
		
	}
	public void userSignedOff(String accountName) {
		
	}
	

}
