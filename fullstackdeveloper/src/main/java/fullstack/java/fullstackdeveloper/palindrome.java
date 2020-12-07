package fullstack.java.fullstackdeveloper;

import java.util.Scanner;

//21212
//palindrome

//6186
//not a palindrome

//-ve values
//Invalid input

public class palindrome 
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number you would like to reverse");
		int number=scan.nextInt();
		int reverse=0;int v1=0; int data=0;
		if(number>0)
		{
		{
		v1=data%10;
		reverse=(reverse*10)+v1;
		data=data/10;
		}
		if(number==reverse)
			{	
			System.out.println("The given number is a palindrome");
			}
		else
			{
			System.out.println("The given number is not a palindrome");
			}
		}
		else
		{
			System.out.println("invalid Input");
		}
	 }	  		
}