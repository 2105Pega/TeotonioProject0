package com.revature.menu;

import java.util.Scanner;
import java.util.regex.Pattern;
//import new account method

public class Menu {

	// reads user input
	public void scanner() {
		
	String answer = "no";
	
	
	
		do {
			// creates scanner obj
			Scanner input = new Scanner(System.in);	
			System.out.println("Welcome to Teo Bank! Please type your username or type apply to start the application process for a new account: ");
			
			// reads user input
			String command = input.nextLine(); 
			
			//checks if user input contains only letters
			if(Pattern.matches("[a-zA-Z]+",command)) {
				System.out.println("great job "+command+" contains only letters");
			}
			else {
				System.out.println(command+" contains non-letters");
				System.out.println("Please only use letters for your input. Try again? Type yes or no.");
				answer = input.next();			
			}
		}
		while(answer.equals("yes"));
		
	}

}
