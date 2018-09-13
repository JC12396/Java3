package Excercises;

import java.util.Scanner;

public class NumbersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input an integer >> ");
		x = input.nextInt();
		System.out.println("Please input an integer >> ");
		y = input.nextInt();
		
		displayTwiceTheNumber(x, y);
		displayPlusFive(x, y);
		displaySquared(x, y);
	}
	public static void displayTwiceTheNumber(int x, int y)
	{
		int x2;
		int y2;
		
		x2 = x * 2;
		y2 = y * 2;
		
		System.out.println("x = " + x2 + " y = " + y2);	
	}
	public static void displayPlusFive(int x, int y)
	{
		int x2;
		int y2;
		
		x2 = x + 5;
		y2 = y + 5;
		
		System.out.println("x = " + x2 + " y = " + y2);	
	}
	public static void displaySquared(int x, int y)
	{
		int x2;
		int y2;
		
		x2 = x * x;
		y2 = y * y;
		
		System.out.println("x = " + x2 + " y = " + y2);	
	}


}
