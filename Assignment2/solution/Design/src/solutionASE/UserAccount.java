package solutionASE;

public class UserAccount {
	
	String userName;
	String Password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	public String login() {
		authenticateUser();	
		
		return "true";	
	}
	private String authenticateUser() {
		getUserDetails();
		//gets userDetails and checks with user input details
		return "true";	
	}
	private void getUserDetails() {
		//gets user details from database
	}
}
