package com.demo;

public class Day3 {
	public static void main(String args[]) {
		Class1 obj = new Class1() {
			public void name() {
				System.out.println("Abstraction");
				
			}
		};
	}
}

abstract class Class1{
	public abstract void name();
	public void marks() {
		System.out.println("80%");
	}
}

interface Class2{
	public abstract void name();
//	public void marks() {
//		System.out.println("80%");
	
	
}

