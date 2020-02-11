/*	Main.java
 * 	This file is simply a sample file that gives students an example of what
 * 		code should look like when writing a project for school
 * 		For example, this header comment describes the contents of this File
 * 
 * 	Joey Kilgore
 * 	EECS 1510 - Intro to Object Oriented
 * 	Dr. Joseph Hobbs
 * 	(note that you won't sign your code in the work place, but this is a project
 * 		and the professor needs to easily/quickly see who wrote it)
 */

/*
 * Main class is the driver class for the test program, and serves no other use
 */
public class Main {
	
	/*
	 * main simply instantiates multiple variables as an example of documenting
	 * 	multiple variables, and the importance of useful naming conventions
	 * This also prints out multiple lines of asterisks to the console
	 */
	public static void main(String args[]) {
		int a, b, c;	// These are terrible names
						//	notice how they give NO indication of their purpose
		
		int linesOfOutput = 3;		// the number of lines we will output to screen
		int numberOfAsterisks = 5;	// number of asterisks on each line of output
		
		for(int i=0; i<linesOfOutput; i++) {			// generate each line of output
			for(int j=0; j<numberOfAsterisks; j++) {	// generate all the asterisks in the line
				System.out.print("*");
			}
			System.out.println();	// move to the next line after printing the asterisks
		}
	}
}
