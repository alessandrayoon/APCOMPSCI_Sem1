import java.util.Scanner;
public class MagPieRunner
{
	public static void main(String[] args)
	{
		MagPie hand = new MagPie();
		
		System.out.println (hand.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (hand.getResponse(statement));
			statement = in.nextLine();
		}
	}
}