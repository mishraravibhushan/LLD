package chat.server;

public class UserStatus {
	private String message;
	private UserStatusType userStatusType;
	public UserStatus(UserStatusType type,String message) {
		
	}
	public UserStatusType getStatusType() {
		return UserStatusType.AVAILEBLE;
	}
	public String getMessage() {
		return "";
	}

}
