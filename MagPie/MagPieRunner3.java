import java.util.Scanner;
public class MagPieRunner3
{
	public static void main(String[] args)
	{
		MagPie3 hand = new MagPie3();
		
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