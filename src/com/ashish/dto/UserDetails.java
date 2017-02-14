package com.ashish.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * @author aadeshpa
 *This is the model class hibernate persist
 */
@Entity(name="stu2")
public class UserDetails {

	@Id
	@Column(name="id")
	private int userId;
	@Column(name="name")
	private String userName;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}
