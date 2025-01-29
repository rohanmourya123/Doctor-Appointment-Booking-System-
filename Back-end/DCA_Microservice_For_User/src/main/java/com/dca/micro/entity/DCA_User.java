package com.dca.micro.entity;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DCA_User {	
	
	@Id
	private String user_Id;
	private String userName;
	private String role;
	private LocalDate created_At;
	private LocalDate last_Updated;
	public DCA_User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DCA_User(String userName, String role) {
		super();
		this.userName = userName;
		this.role = role;
		this.created_At = LocalDate.now();
		this.last_Updated = LocalDate.now();
	}
	public DCA_User(String user_Id, String userName, String role) {
		super();
		this.user_Id = user_Id;
		this.userName = userName;
		this.role = role;
		this.created_At = LocalDate.now();
		this.last_Updated = LocalDate.now();
	}
	public String getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public LocalDate getCreated_At() {
		return created_At;
	}
	public LocalDate getLast_Updated() {
		return last_Updated;
	}
	
}
