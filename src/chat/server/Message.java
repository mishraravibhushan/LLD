package chat.server;

import java.util.Date;

public class Message {
	private String content;
	private Date date;
	public Message(String content,Date date ) {
		
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
