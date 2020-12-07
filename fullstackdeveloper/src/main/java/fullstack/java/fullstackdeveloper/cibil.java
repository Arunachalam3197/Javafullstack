package fullstack.java.fullstackdeveloper;

import java.util.Scanner;

public class cibil 
{
	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your cibil score: ");
	int cibil=scan.nextInt();
	if(cibil<500||cibil>1000)
	{
		System.out.println("Not eligible for loans");
	}
	else
	{
		System.out.println("congratulations you are eligible for loan");
		if(cibil>=500&&cibil<=650)
		{
			System.out.println("You are eligible for personal Loan 1 Lakh");
		}
		else if(cibil>650&&cibil<=800)
		{
			System.out.println("You are eligible for Business Loan 5 Lakhs");
		}
		else if(cibil>800&&cibil<=1000)
		{
			System.out.println("You are eligible for Home Loan 7 Lakhs");
		}
	}
	}
}
