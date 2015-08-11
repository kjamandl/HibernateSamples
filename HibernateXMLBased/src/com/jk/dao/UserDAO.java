package com.jk.dao;

public class UserDAO {
	public String getUserName(int userId) {
		if (userId == 1) {
			return "Kishore";
		} else {
			return "No User found";
		}
	}

	public String getUserEmail(int userId) {
		if (userId == 2) {
			return "kijamand@gmail.com";
		} else {
			return "No User found";
		}
	}
}
