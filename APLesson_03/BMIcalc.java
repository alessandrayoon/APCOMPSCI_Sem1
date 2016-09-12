import java.util.Scanner; //imort Statement

public class BMIcalc
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi. My name is BMIcalculator.");
		
		//prompt for user input
		System.out.println("May I as for your height in inches?");
		
		//search for next integer that the user enters
		int height = keyboard.nextInt();
		
		//prompt for user input
		System.out.println(" May I ask your wieght in pounds?");
		
		//search for next integer that the user enters
		int weight = keyboard.nextInt();
		
		float BMI= (weight* 703)/(height*height);
		System.out.println(BMI);
	}
}