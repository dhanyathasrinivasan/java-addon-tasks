package com.demo;

import java.util.Date;
import java.util.Scanner;

public class Register {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your Username:");
		String username = scan.nextLine();
		System.out.println("enter your Password:");
		String password = scan.nextLine();
		System.out.println("enter your Email:");
		String email = scan.nextLine();
		System.out.println("Enter your Address:");
		String address =scan.nextLine();
		System.out.println("Enter your Mobile Number:");
		long mobileNumber = scan.nextLong();
		Date createdAt = new Date();
		Date updatedAt = new Date();
		boolean isActive = true;
		
		EncapsulationClass person1 = new EncapsulationClass();
		
		person1.setUsername(username);
		person1.setUsername(password);
		person1.setEmail(email);
		person1.setAddress(address);
		person1.setMobilenumber(mobileNumber);
		person1.setCreatedat(createdAt);
		person1.setUpdatedat(updatedAt);
		person1.setIsactive(isActive);
		
		
		System.out.println(person1.getUsername());
		System.out.println(person1.getPassword());
		System.out.println(person1.getEmail());
		System.out.println(person1.getAddress());
		System.out.println(person1.getMobilenumber());
		System.out.println(person1.getCreatedat());
		System.out.println(person1.getUpdatedat());
		System.out.println(person1.getIsactive());
		
		
	scan.close();	
	}
}
	
