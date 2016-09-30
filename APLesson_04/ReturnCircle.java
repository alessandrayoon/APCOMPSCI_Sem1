import java.util.Scanner; //import Statement
public class ReturnCircle
{
	
	
	public static void main(String[]args)
	{
		Circle area = new Circle();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the length of the radius:");
		double r = keyboard.nextDouble();
		
		print ("The area of a circle with a radius of " + r +  " is " , calcArea(r));
		
		
	
	}
	public static double calcArea(double r)
	
	{
		 return 3.14*r*r;
	}
	public static void print(String text, double area)
	{
		System.out.print(text + area);
	}
}