package fullstack.java.fullstackdeveloper;

import java.util.Scanner;

public class DemoScanner 
{
	public static void main(String[] args) 
	{
	Scanner scan= new Scanner(System.in);
	String packName=""; short packValue=0;
	long cusId=0L; short duration=0;
	System.out.println("Tell us package name:");
	packName=scan.nextLine();
	System.out.println("Tell us Customer ID:");
	cusId=scan.nextLong();
	System.out.println("Tell us pack Value:");
	packValue=scan.nextShort();
	System.out.println("Tell us pack Duration:");
	duration=scan.nextShort();
	System.out.println("congrats your package "+packName+" for the Customer ID "+cusId+" has recharged with "+packValue+" for "+duration+" days");		
	}	
}
