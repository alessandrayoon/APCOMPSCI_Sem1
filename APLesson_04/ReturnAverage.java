import java.util.Scanner; //import Statement
public class ReturnAverage
{
	
	
	
	public static void main(String[]args)
	{
		Average calculation = new Average();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the first value:");
		int num1 = keyboard.nextInt();
		
		System.out.println("Please enter the second value:");
		int num2 = keyboard.nextInt();
		
		
		System.out.println("Please enter the third value:");
		int num3 = keyboard.nextInt();
	
		print("The average of " + num1 + ", " + num2 + ", " + num3 + " is " , calcAverage(num1, num2,num3));
		
		
	}
	public static int calcAverage(int num1 , int num2, int num3)
	
	{
		 return (num1 + num2 + num3) / 3;
	}
	public static void print(String text, int average)
	{
		System.out.println(text + average);
	}
}