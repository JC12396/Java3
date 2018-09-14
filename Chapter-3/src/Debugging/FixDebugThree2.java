package Debugging;

	//This application displays some math facts
	public class FixDebugThree2
	{
		public static void main(String args[])
		{
			int a = 2;
			int b = 5;
			int c = 10;
			
			add(b, c);
			subtract(c, a);            
		}
		public static void add(int a, int  b)
		{
			System.out.println("The sum of " + a +
					" and " + b + " is " + (a + b));
		}
		public static void subtract(int c, int a)
		{
			System.out.println("The difference between " +
			  c + " and " + a + " is " +  (c - a));
		}
}