package Tutorial;

import java.util.Scanner;

public class InchesToFeet {

	public static void main(String[] args) {
	    int inches;
	    
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Enter inches >> ");
	    inches = input.nextInt();
	    
	    displayConversion(inches);
	    
	}
	public static void displayConversion(int inches)
	{
		final int INCHES_IN_FOOT = 12;
		int feet;
		int inchesLeft;
		
		feet = inches / INCHES_IN_FOOT;
		inchesLeft = inches % INCHES_IN_FOOT;
		
	    System.out.println(inches + " inches is " +
	    feet + " feet and " + inchesLeft + " inches"); 
	}
	
}
