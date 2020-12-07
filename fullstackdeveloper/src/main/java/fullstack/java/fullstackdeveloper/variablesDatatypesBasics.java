package fullstack.java.fullstackdeveloper;

public class variablesDatatypesBasics 
{
	public static void main(String[] args) 
	{
		System.out.println("Going to Store Arun Laptop Details\n");
		short Ram=4; 
		float Size=15.3F;
		String ModelName="Pavilion";
		double Price=99999.99;
		System.out.println("Arun confirms Laptop Details such as:");
		System.out.println("ModelName is "+ModelName+"\nMonitor size is "+Size+"\nRamcapacity is "+Ram+"\nLaptop price is "+Price+"\n");
		
		System.out.println("\nGoing to print in C format");
		System.out.printf("ModelName is: %s\nMonitor size is: %.1f\nRamcapacity in GB is: %d\nLaptop price is %.3f\n",ModelName,Size,Ram,Price);
	}
}
