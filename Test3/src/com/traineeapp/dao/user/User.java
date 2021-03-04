package com.traineeapp.dao.user;

public class User {
	private String username;
	private String password;
	private String profile;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public User(String username, String password, String profile) {
		this.username = username;
		this.password = password;
		this.profile = profile;
	}

	public User() {
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [username=");
		builder.append(username);
		builder.append(", password=");
		builder.append(password);
		builder.append(", profile=");
		builder.append(profile);
		builder.append("]");
		return builder.toString();
	}

}
