package personal.call.center;

public class User {
	private String name;
	private long ID;
	
	public static User addUser(String name,long id) {
		return new User();
	}

}
