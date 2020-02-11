/*
 * Main.java
 * 
 * This class goes through how to debug your code. The accompanying README.md
 * file will be extremely helpful.
 * 
 * The program below is a leap year checker. The rules for a year to be a 
 * leap year are the following
 * If the year is divisible by 4 		it is a leap year
 * If it is also divisible by 100		it is NOT a leap year
 * If it is also divisible by 400		it is a leap year
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
public class Main {
	
	/*
	 * main will instantiate the program and handle all IO with the user
	 * (all IO is through the console)
	 */
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);	// setup IO with the console
		
		int year;	// store user inputs
		
		// First we will prompt the user to input the year
		System.out.println("Input a year : ");
		year = in.nextInt();
		
		// We must determine if the input is a leap year using the 3 rules
		boolean isLeap;
		// first rule, must be divisible by 4 to be a leap year
		if(year%4 == 0)
		{	// second rule, it must not be divisible by 100 to be a leap year
			if(year%100 != 0)
			{	// not divisible by 100 but it is divisible by 4
				isLeap = true;
			}
			else
			{	
				// third rule, if divisible by 400 it is a leap year
				if(year%400 == 0)
				{	// year is divisible by 400
					isLeap = true;
				}
				else
				{	// year is not divisible by 400
					isLeap = false;
				}
			}
		}
		else
		{	// year is not divisible by 4 so it is not a leap year
			isLeap = false;
		}
		
		// finally we will print whether the year is a leap year or not
		if(isLeap)
		{
			System.out.println("That is a leap year!");
		}
		else
		{
			System.out.println("That's not a leap year.");
		}
	}
}
