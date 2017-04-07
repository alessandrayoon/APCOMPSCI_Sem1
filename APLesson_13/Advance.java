import java.lang.Math.*;
import java.util.ArrayList;
public class Advance extends Ticket
{
	private int daysleft;
	public Advance()
	{
		super();
		daysleft = 0;
	}
	
	public Advance(int dl)
	{
		super();
		daysleft = dl;
	}
	
	public double getprice()
	{
		if(daysleft >= 10)
			return 30.00;
		else
			return 40.00;
	}
}