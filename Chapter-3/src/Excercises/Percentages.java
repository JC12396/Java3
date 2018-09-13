package Excercises;

import java.util.Scanner;

public class Percentages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 5;
		double y = 12;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input an integer >> ");
		x = input.nextDouble();
		System.out.println("Please input an integer >> ");
		y = input.nextDouble();
		
		computePercent(x, y);
		
	}
	public static void computePercent(double x, double y)
	{
		double compute;
		
		compute = (x / y) * 100;
		
		System.out.println(x +" diveded by " + y + " = " + compute + "%");
	}

}
