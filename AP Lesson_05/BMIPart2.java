import java.util.Scanner; 

public class BMIPart2
{
	static String condition = " ";
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi. My name is BMIcalculator.");
		
		
		System.out.println("May I as for your height in inches?");
		double height = keyboard.nextDouble();
		
		
		System.out.println(" May I ask your wieght in pounds?");
		double weight = keyboard.nextDouble();
		
		double BMI= (weight* 703)/(height*height);
		
		System.out.println("Your BMI is " + BMI);
		
		String condition = calcCondish(BMI);
		System.out.println("Your condition is " + condition);
		
	}
	
	public static String calcCondish(double BMI)
	{
		if(BMI < 18.5)
			condition = "Underweight";
	 
		else if (BMI < 24.9)
			condition =  "Normal";
		
		else if ( BMI < 29.9)
			condition = "Overweight";
		
		else if (BMI < 34.9)
			condition =  "Obese";
		
		else if (BMI < 39.9)
			condition =  "Very Obese";	
		
		if (BMI > 39.9)
			condition = "Morbidly Obese";
		
		return condition;
	}
	

}