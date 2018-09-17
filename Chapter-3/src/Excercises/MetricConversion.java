package Excercises;

import java.util.Scanner;

public class MetricConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double inches;
		double liters;
		
		inches = iToC();
		
		liters = lToG();
		
		
	}
	public static double iToC()
	{
		double inches;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter inches ");
		inches = input.nextDouble();
		double centimeters;
		centimeters = inches * 2.54;
		System.out.println(inches + " inches is " + centimeters + " centimeters.");
	    return centimeters;
	}
	public static double lToG()
	{
		double liters;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter liters ");
		liters = input.nextDouble();
		double gallons;
		gallons = liters * .264;
		System.out.println(liters + " liters is " + gallons + " gallons.");
	    return gallons;
	}
}
