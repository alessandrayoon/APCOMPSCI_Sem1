import java.util.Scanner; //import Statement
public class Rectangle
{
	static double length;
	static double width;
	static double perimeter;
	
	
	public static void main(String[]args)
	{
		Rectangle perimeter = new Rectangle();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the length:");
		double l = keyboard.nextDouble();
		
		System.out.println("Please enter the width:");
		double w = keyboard.nextDouble();
		
		System.out.println("Please enter the perimeter:");
		double p = keyboard.nextDouble();
		
		print();
		calcPerim();
		
	}
	public static void calcPerim()
	
	{
		return length*width*perimeter;
	}
	public static void print()
	{
		System.out.printf("Your rectangle is %1.5f ft around.\n", calcPerim());
	}
}