import java.util.Scanner; //import Statement
public class Ex_04
{
	public static void main(String[]args)
	{
		
		Ex_04 volume = new Ex_04();
		
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the height in inches:");
		
		//prompt for user input
		double h = keyboard.nextDouble();
		
		System.out.println("Please enter the length in inches:");
		
		//prompt for user input
		double l = keyboard.nextDouble();
		
		System.out.println("Please enter the width in inches:");
		//prompt for user input
		double w = keyboard.nextDouble();
		
		
		double formula = volume.calcVol(h ,l ,w);
		System.out.printf("Your volume in cubic feet is %10.2f\n " ,formula );
	}
	
	public double calcVol (double height, double length, double width)
	{
		return (length*width*height/(1728));
	}
}