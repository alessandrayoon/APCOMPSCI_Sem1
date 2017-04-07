import java.lang.Math.*;
import java.util.ArrayList;
public class Walkup extends Ticket
{
	private int daysleft;
	public Walkup()
	{
		super();
		daysleft = 0;
	}
	
	public Walkup(int dl)
	{
		super();
		daysleft = dl;
	}
	
	public double getprice()
	{
		return 50.00;
	}
}