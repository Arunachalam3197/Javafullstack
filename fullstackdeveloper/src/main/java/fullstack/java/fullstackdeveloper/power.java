package fullstack.java.fullstackdeveloper;

import java.util.Scanner;

public class power 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=scan.nextInt();
		System.out.println("Enter the power ");
		int power=scan.nextInt();
		int out=1;
		while(power>0)
		{
			out=out*num;
			power--;
		}
			System.out.println("the output is "+out);
	}
}
