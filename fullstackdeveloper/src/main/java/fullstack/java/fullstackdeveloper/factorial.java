package fullstack.java.fullstackdeveloper;

import java.util.Scanner;

public class factorial 
{
public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number you wish to check the factorial");
	int user=scan.nextInt();
	int each=1, fact=1;
	if(user>0)
	{
		while(fact<user)
		{
			each++;
			fact*=each;
		}
		if(fact==user)
			System.out.println("The given Factorial number is "+each);
		else
			System.out.println("Sorry, The given number is not a Factorial Number");
	}
	else
		System.out.println("Invalid Input");
}
}
