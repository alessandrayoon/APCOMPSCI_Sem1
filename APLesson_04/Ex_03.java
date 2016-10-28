import java.util.Scanner; //import Statement
public class Ex_03
{
	public static void main(String[]args)
	{
		
		Ex_03 compInt = new Ex_03();
		
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your interest rate:");
		
		//prompt for user input
		double r = keyboard.nextDouble();
		
		System.out.println("Please enter your principal:");
		
		//prompt for user input
		double P = keyboard.nextDouble();
		
		System.out.println("Please enter the number of time your loan is compounded per year:");
		//prompt for user input
		double n = keyboard.nextDouble();
		
		System.out.println("Please enter the life of your loan:");
		//prompt for user input
		double t = keyboard.nextDouble();
		
		
		double formula = compInt.interest(r, P, n, t);
		System.out.printf("Your total monthly payment is %10.2f\n " ,formula );
	}
	
	public double interest (double rate, double principal, double number, double time)
	{
		return ((principal*Math.pow(1+rate/number, number*time))/(12*time));
	}
}