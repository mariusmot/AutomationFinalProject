package testdata;

import core.utility.Reader;

public class User {
	private String username;
	private String password;
	
	public User(String fileName) {
		this.username = Reader.json(fileName).get("username").toString();
		this.password = Reader.json(fileName).get("password").toString();
	}
	public void setUserName(String username) {
		this.username = username;
	}
	public String getUserName() {
		return this.username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return this.password;
	}

}
