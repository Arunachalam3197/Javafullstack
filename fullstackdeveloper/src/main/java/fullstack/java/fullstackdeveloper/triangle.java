package fullstack.java.fullstackdeveloper;

import java.util.Scanner;

public class triangle 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter side1:");
		int side1=scan.nextInt();
		System.out.println("Enter side2:");
		int side2=scan.nextInt();
		System.out.println("Enter side3:");
		int side3=scan.nextInt();
		if(side1>0&&side2>0&&side3>0)
		{
		if(((side1+side2)>side3)&&((side2+side3)>side1)&&((side1+side3)>side2))
			{
			System.out.println("All three sides forms the Triangle");
			}
			else
			{
			System.out.println("Cannot form the triangle");
			}
		}
		else
		{
			System.out.println("invalid input");
		}
	}
}
