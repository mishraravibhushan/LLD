package online.book.reading;

import java.io.ObjectInputStream.GetField;

public class Book {
	
	private int bookId;
	private String details;
	
	public Book(int id,String details) {
		bookId= id;
		this.details = details;
	}
	
	public int getID() {
		return bookId;
	}
	public void setID(int id) {
		bookId = id;
	}
	
	public String getDetails() {
		return details;
	}
	public void setDettails(String d) {
		details = d;
	}
	

}
