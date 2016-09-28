import java.util.Scanner; //import Statement
public class Rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	
	public static void main(String[]args)
	{
		Rectangle perimeter = new Rectangle();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the length:");
		l = keyboard.nextDouble();
		
		System.out.println("Please enter the width:");
		w = keyboard.nextDouble();
		
	
		
		
		calcPerim();
		print();
	}
	public static void calcPerim()
	
	{
		 perimeter = (2*l) + (2*w);
	}
	public static void print()
	{
		System.out.printf("Your rectangle is %1.5f ft around.\n", perimeter);
	}
}