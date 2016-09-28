import java.util.Scanner; //import Statement
public class Average
{
	static double num1;
	static double num2;
	static double num3;
	static double average;
	
	
	public static void main(String[]args)
	{
		Average calculation = new Average();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the first value:");
		num1 = keyboard.nextDouble();
		
		System.out.println("Please enter the second value:");
		num2 = keyboard.nextDouble();
		
		
		System.out.println("Please enter the third value:");
		num3 = keyboard.nextDouble();
	
		
		
		calcAverage();
		print();
	}
	public static void calcAverage()
	
	{
		 average = (num1 + num2 + num3) / 3;
	}
	public static void print()
	{
		System.out.printf("The average of " + " " + num1 + " " + num2 + " and " + num3 + " " + "is %1.5f ft.\n", average);
	}
}