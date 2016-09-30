import java.util.Scanner; //import Statement
public class ReturnCube
{
	
	
	public static void main(String[]args)
	{
		Cube surfacearea = new Cube();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the length of the side:");
		double side = keyboard.nextDouble();
		
		print("The surface area of a cube with a side length of " + side + " is ", calcSurfaceArea(side));
		
	
		
		
		
	}
	public static double calcSurfaceArea(double side)
	
	{
		 return 6*Math.pow(side,2);
	}
	public static void print(String text, double surfacearea)
	{
		System.out.println(text + surfacearea);
	}
}