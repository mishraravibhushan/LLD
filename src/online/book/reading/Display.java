package online.book.reading;

public class Display {
	private Book activeBook;
	private User activeUser;
	private int pageNumber = 0 ;
	
	public void displayUser(User user) {
		activeUser = user;
		refreshUserName();
	}
	
	public void displayBook(Book book) {
		pageNumber = 0 ; 
		activeBook = book;
		refreshTitle();
		refreshDetails();
		refreshPage();
	}
	public void turnPageForward() {
		pageNumber++;
		refreshPage();
	}
	
	public void turnPageBackward() {
		pageNumber--;
		refreshPage();
	}
	
	
	public void refreshPage() {
		
	}
	public void refreshTitle() {
		
	}
	public void refreshDetails() {
		
	}
	public void refreshUserName() {
		
	}

}
