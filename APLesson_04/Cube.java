import java.util.Scanner; //import Statement
public class Cube
{
	static double side;
	static double surfacearea;
	
	
	
	public static void main(String[]args)
	{
		Cube surfacearea = new Cube();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the length of the side:");
		side = keyboard.nextDouble();
		
		
		
	
		
		
		calcSurfaceArea();
		print();
	}
	public static void calcSurfaceArea()
	
	{
		 surfacearea = Math.pow(6*side,2);
	}
	public static void print()
	{
		System.out.printf("The surface area of a cube with a side length of " + side + " is %1.5f ft.\n", surfacearea);
	}
}