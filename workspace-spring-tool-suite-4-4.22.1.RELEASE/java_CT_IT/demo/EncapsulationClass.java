package com.demo;

import java.util.Date;
public class EncapsulationClass {
	private String username;
	private String password;
	private String email;
	private String address;
	private long  mobileNumber;
	private Date createdAt;
	private Date updatedAt;
	private boolean isActive;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username=username;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}

	public long getMobilenumber() {
		return mobileNumber;
	}
	public void setMobilenumber(long mobileNumber) {
		this.mobileNumber=mobileNumber;
	}

	public Date getCreatedat() {
		return createdAt;
	}
	public void setCreatedat(Date createdAt) {
		this.createdAt=createdAt;
	}
	public Date getUpdatedat() {
		return updatedAt;
	}
	public void setUpdatedat(Date updatedAt) {
		this.updatedAt=updatedAt;
	}
	public boolean getIsactive() {
		return isActive;
	}
	public void setIsactive(boolean isActive) {
		this.isActive=isActive; 
	}
}
