package Excercises;

import java.util.Scanner;

public class FtoC {

	public static void main(String[] args) 
	{
		double f8;
		double f12;
		double f5;
		int time1;
		int time2;
		int time3;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What was the time you measured the first temperature. >> ");
		time1 = input.nextInt();
		System.out.println("What was the time you measured the second temperature. >> ");
		time2 = input.nextInt();
		System.out.println("What was the time you measured the third temperature. >> ");
		time3 = input.nextInt();
		System.out.println("What was the temperature in Farenhiet at " + time1 + " >> ");
		f8 = input.nextDouble();
		System.out.println("What was the temperature in Farenhiet at " + time2 + " >> ");
		f12 = input.nextDouble();
		System.out.println("What was the temperature in Farenhiet at " + time3 + " >> ");
		f5 = input.nextDouble();
		
		celciusConvert(f8, time1);
		celciusConvert(f12, time1);
		celciusConvert(f5, time1);
		
		
	}
	public static void celciusConvert (double temp, int time)
	{	
		double Ctemp;
		Ctemp = (temp - 32) * .5556;
		System.out.println("The new temperature at " + time + " is " + Ctemp + "C.");
		
	}

}
