package Debugging;

public class FixDebugThree4
{
   public static void main(String args[])
   {
      int myCredits = 13;
      int yourCredits = 17;
      double rate = 75.84;
      
      System.out.println("My tuition:");
      
      tuitionBill(myCredits, rate);
      
      System.out.println("Your tuition:");
      
      tuitionBill(yourCredits, rate);
   }
   public static void tuitionBill(int myCredits, double rate)
   {
	  double total = Math.round(rate * myCredits * 100.0) / 100.0;
      System.out.println("Total due " + total);
   }
   
}