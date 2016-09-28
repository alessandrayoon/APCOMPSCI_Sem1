import java.util.Scanner; //import Statement
public class Circle
{
	static double r;
	static double area;
	
	
	
	public static void main(String[]args)
	{
		Circle area = new Circle();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the length of the radius:");
		r = keyboard.nextDouble();
		
		
		
		
		calcArea();
		print();
	}
	public static void calcArea()
	
	{
		 area = 3.14*r*r;
	}
	public static void print()
	{
		System.out.printf("The area of a circle with a radius of " + r +  " is %1.5f ft.\n", area);
	}
}