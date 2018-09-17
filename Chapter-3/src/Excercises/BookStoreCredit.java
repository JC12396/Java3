package Excercises;

import java.util.Scanner;

public class BookStoreCredit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		double gpa;

		gpa = gpaToCredit();
		
		creditTotal(gpa);
	}


	public static double gpaToCredit()
	{
		double gpa;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter GPA ");
	    gpa = input.nextDouble();
	    return gpa;
	}
	public static double creditTotal(double gpa)
	{
		double credit = gpa * 10;
		
		System.out.println("Your credit = $" + credit);
		return credit;
	}
}
