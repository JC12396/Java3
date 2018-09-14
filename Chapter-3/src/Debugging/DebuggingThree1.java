package Debugging;

public class DebuggingThree1
{
   public static void main(String args[])
   {
	  double bill = 180;
      double myCheck = 50.00;
      double yourCheck = 19.95;
      System.out.println("Tips are cool.");
      calcTip(bill);
    }
    public static void calcTip(double bill)
    {
      final double RATE = 0.15;
      double tip;
      tip = bill * RATE;
      System.out.println("The tip should be at least " + tip);
    }
}