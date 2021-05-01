import java.util.Scanner;

public class ForgetfulMachine {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("what city is the capital of France");
		keyboard.next();
		
		System.out.println("What is 6 multiplied by 7?");
		keyboard.nextInt();
		
		System.out.println("Enter a number between 0.0 and 1.0");
		keyboard.nextDouble();
		
		System.out.println("Is there anything else you would like to say?");
		keyboard.next();

	}
}

/*
 
Note:
We say “Keyboard, runyour next() function.” 
The Scanner object will pause the program and wait for the human to type
something. Once the human types something and presses Enter, the Scanner object will package it
into a String and allow your code to continue. 
 
 
 */