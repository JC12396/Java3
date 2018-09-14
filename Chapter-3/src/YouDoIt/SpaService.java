package YouDoIt;

import java.util.Scanner;

public class SpaService {
	private String serviceDescription;
	private double price;
	
	public static void main(String[] args) 
	{
		String service;
		double price;
		
		SpaService firstService = new SpaService();
		SpaService secondService = new SpaService();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter service >> ");
		service = keyboard.nextLine();
		System.out.print("Enter price >> ");
		price = keyboard.nextDouble();
		
	}
	
	public void setServiceDescription(String service)
	{
		serviceDescription = service;
	}
	
	public void setPrice(double pr)
	{
		price = pr;
	}
	
	public String getServiceDescription()
	{
		return serviceDescription;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public class CreateSpaServices
	{

	}

}
