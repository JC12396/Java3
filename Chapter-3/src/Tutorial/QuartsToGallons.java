package Tutorial;

import java.util.Scanner;

public class QuartsToGallons {

	public static void main(String[] args) 
	{
		int quartsNeeded;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter quarts needed>>>");
		quartsNeeded = input.nextInt();
		displayConversion(quartsNeeded);
	}
	public static void displayConversion(int quartsNeeded)
	{
		final int quartsInGallons = 4;
		int gallonsNeeded;
		int extraQuarts;
		
		gallonsNeeded = quartsNeeded / quartsInGallons;
		extraQuarts = quartsNeeded % quartsInGallons;
		System.out.println("There are " + gallonsNeeded + " gallons and " + extraQuarts + " quarts.");
	}
}