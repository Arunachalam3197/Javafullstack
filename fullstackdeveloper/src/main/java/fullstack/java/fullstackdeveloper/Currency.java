package fullstack.java.fullstackdeveloper;

import java.util.Scanner;

public class Currency 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us money in Dollar you wish to invest in India:");
		int Dollar=scan.nextInt();
		double Rupees=Dollar*73.14;
		System.out.println("Your investment in Rupees:"+Rupees+"");
	}
}
