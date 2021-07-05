package chat.server;

import java.util.ArrayList;
import java.util.HashMap;

public class User {
	private int id;
	private UserStatus status = null;
	/*
	 * maps from the others participants's user id to the chat
	 */
	private HashMap<Integer,PrivateChat> privateChats;
	
	/*
	 * list of group chats
	 */
	private ArrayList<GroupChat> groupChats;
	/*
	 * maps from other person's user id to the add request
	 */
	private HashMap<Integer,AddRequest> receivedAddRequests;
	
	/*
	 * maps from the other person's user id to add requests
	 */
	private HashMap<Integer,AddRequest> sentAddRequests;
	
	/*
	 * maps from user id to user object
	 */
	private HashMap<Integer, User> contacts;
	
	private String accountName;
	private String fullName;
	
	public User(int id,String accountName,String fullName) {
		
	}
	public boolean sendmEssageToUser(User to,String content) {
		return true;
	}
	
	public boolean sendMessageToGroupChat(int id,String count) {
		return true;
	}
	public void setStatus(UserStatus status) {
		
	}
	public UserStatus getStatus() {
		return null;
	}
	public boolean addContact(User user) {
		return true;
	}
	public void receivedAddRequest(AddRequest addRequest) {
		
	}
	public void sentAddRequest(AddRequest addRequest) {
		
	}
	public void removeAddRequest(AddRequest addRequest) {
		
	}
	public void requestAddUser(String accountName) {
		
	}
	public void addConversation(PrivateChat conversation) {
		
	}
	public void addConversation(GroupChat groupChat) {
		
	}
	public int getId() {
		return 0;
	}
	public String getAccountName() {
		return "";
	}
	public String getFullName() {
		return "";
	}
	
	
	
	

}
