/*
 * FillInTheBlank.java
 * 
 * This class goes through how to write code in a efficient and straight forward
 * manner, and create well documented clean code.
 * The original code for the class likely won't do anything, and it is up
 * to the programmer using this file to 'Fill in the blanks' of code
 * Filling in the blanks between comments means that you essentially write pseudocode
 * and then over time fill in the pseudocode with real code. 
 * 
 * The program below is like a calculator, the user is prompted with options
 * to input two numbers and then ask whether to add or subtract the two numbers
 * 
 * Joey Kilgore
 * EECS 1510 - Intro to Object Oriented
 * Dr. Joseph Hobbs
 *
 */

import java.util.Scanner;

/*
 * Sample program that functions as the driver for this program and 
 * includes the prompting the user for inputs
 */
public class FillInTheBlank {
	
	/*
	 * main will instantiate the program and handle all IO with the user
	 * (all IO is through the console)
	 */
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);	// setup IO with the console
		
		int input1, input2;	// store user inputs
		
		// First we will prompt the user to input two numbers
		System.out.println("Input a number : ");
		input1 = in.nextInt();
		// Next we will prompt the user for a second number
		/* FILL IN HERE */
		
		int option;	// store the input for whether we will add or subtract numbers
		// get input from user on whether to add or subtract
		System.out.println("Input a 1 to add or a 2 to subtract : ");
		/* FILL IN HERE */
		
		// now we will handle the two options
		if(option == 1) {
			// if option 1 was chosen, then we will add the two numbers together
			add(input1, input2);
		}else if(option == 2) {
			// if option 2 was chosen, then we will subtract the two numbers
			/* FILL IN HERE */
		}
	}
	
	/*
	 * add takes two ints as arguments, and then prints the sum to the console
	 */
	public static void add(int num1, int num2) {
		int sum = num1 + num2;		// calculate sum
		System.out.println(sum);	// print sum to console
	}
	
	/*
	 * subtract takes two ints  as arguments, then prints the difference to the console 
	 */
	public static void subtract(int num1, int num2) {
		/* FILL IN HERE */			// calculate difference
		/* FILL IN HERE */			// print difference to console
	}
}
