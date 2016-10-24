import java.util.Scanner;
public class GraphTable
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = kb.nextInt();
		System.out.println("Please enter the size of the table : ");
		int size = kb.nextInt();
		
		for(int i = 1; i <= size; i++)
			
		
		
		{
			int iterator = number * i;
			System.out.println(i + "\t" + iterator);
			
		}
		
	}
}