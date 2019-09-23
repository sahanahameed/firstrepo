package com.ust.git;

public class Main {

	public static void main (String[] args){
		SalesData objSD=new SalesData();
		System.out.println("hellooo guys");
		displayGreetings();
		objSD.display();
	}
	
	private static void displayGreetings(){
		System.out.println("welcome to sales Data");
	}
}
