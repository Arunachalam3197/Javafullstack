package fullstack.java.fullstackdeveloper;

import java.util.Scanner;

//age 	coins
//1		1
//2		8
//3		27
//4		64
//5		125
//6		216
//7		343
//8		512
//9		729
//10	1000

  
  public class cubes 
{
	 public static void main(String args[])
	 {
	  Scanner scan=new Scanner(System.in);	
	  System.out.println("Enter the value of age");
	  int age=scan.nextInt();
	  if(age>0)
	  {
		  age=age*age*age;
			System.out.println("the coins is "+age);
	  }
	  else
			System.out.println("invalid");
	 }	  
}	