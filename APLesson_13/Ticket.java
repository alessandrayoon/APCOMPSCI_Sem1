import java.lang.Math.*;
import java.util.ArrayList;
public abstract class Ticket
{
	private int serialno;
	
	public Ticket()
	{
		serialno = (int)(Math.random()*900000) + 1000000;
	}
	
	public abstract double getprice();
	
	public int getserialno()
	{
		return serialno;
	}
	
	public String toString()
	{
		return "\nSerial #: " + getserialno() + "\nPrice: " + getprice();
	}
}