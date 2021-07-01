package online.book.reading;

import java.util.HashMap;

public class UserManager {
	private HashMap<Integer,User> users;
	
	public User adUser(int id,String details,int accountType) {
		if(users.containsKey(id)) {
			return null;
		}
		User user = new User(id,details,accountType);
		users.put(id, user);
		return user;
		
	}
	public User find(int id) {
		return users.get(id);
	}
	public boolean remove(User user) {
		return remove(user.getUserID());
	}
	public boolean remove(int id) {
		if(!users.containsKey(id)) {
			return false;
		}
		users.remove(id);
		return true;
	}

}
