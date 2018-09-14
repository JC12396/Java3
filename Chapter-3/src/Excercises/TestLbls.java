package Excercises;

import java.util.Scanner;

public class TestLbls {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double pounds;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your weight in pounds? >> ");
		pounds = input.nextDouble();
		
		poundsToKg(pounds);
		poundsToOz(pounds);
		poundsToMg(pounds);
		
		}
	public static void poundsToKg(double pounds) 
	{
		double kg;
		
		kg = pounds * (1/2.2);
		
		System.out.println(pounds +" lbs is " + kg + " kg");
	}
	public static void poundsToOz(double pounds) 
	{
		double oz;
		
		oz = pounds * 16;
		
		System.out.println(pounds +" lbs is " + oz + " oz");
	}
	public static void poundsToMg(double pounds) 
	{
		double mg;
		
		mg = pounds * 453592.37;
		
		System.out.println(pounds +" lbs is " + mg + " mg");
	}

}
