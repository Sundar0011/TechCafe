package com.firstproject;

public class User {
	 String UserName,Email,Password,code;

	public User(String userName, String email, String password, String code) {
		super();
		UserName = userName;
		Email = email;
		Password = password;
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public User(String userName, String email, String password) {
		super();
		UserName = userName;
		Email = email;
		Password = password;
	}

	

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	

}
