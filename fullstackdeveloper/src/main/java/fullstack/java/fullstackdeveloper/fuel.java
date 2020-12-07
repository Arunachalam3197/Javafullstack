package fullstack.java.fullstackdeveloper;

import java.util.Scanner;

public class fuel 
{
public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Tell us the fuel filled:");
	double fuel=scan.nextDouble();
	System.out.println("Tell us the distance crossed:");
	double distance=scan.nextDouble();
	double USA=0,ind=0;
	USA=(distance*0.6214)/(fuel*0.2642);
	ind=fuel/distance*100;		
	System.out.printf("calcuated fuels/distance are "+USA+" "+ind);
	}
}
