package chat.server;

import java.util.ArrayList;

public abstract class Conversation {
	protected ArrayList<User> participants;
	protected int id;
	protected ArrayList<Message> messages;
	
	public ArrayList<Message> getMessages(){
		return messages;
	}
	public boolean addMessage(Message m) {
		return true;
	}
	public int getId() {
		return 0;
	}

}
