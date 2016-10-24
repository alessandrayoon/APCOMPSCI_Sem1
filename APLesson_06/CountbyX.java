import java.util.Scanner;
public class CountbyX
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number to count by : ");
		int start = kb.nextInt();
		System.out.println("Please enter an ending number : ");
		int end = kb.nextInt();
		
		for(int i = start; i<= end; i+=start)
			
		
		
		{
			
			System.out.print(i + "\t");
		}
		
	}
}