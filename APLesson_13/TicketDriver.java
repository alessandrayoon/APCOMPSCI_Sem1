import java.lang.Math.*;
import java.util.ArrayList;
public class TicketDriver
{
	public static void main(String[]args)
	{
		Walkup w = new Walkup(10);
		System.out.print(w);
		Advance a = new Advance(10);
		System.out.print(a);
		StudentAdvance sa = new StudentAdvance(10);
		System.out.print(sa);
		
	}
}