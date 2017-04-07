import java.lang.Math.*;
import java.util.ArrayList;
public class Honda implements location
{
	private int ID;
	private double[] location = new double[2];
	
	public Honda()
	{
		location = new double[2];
	}
	
	public Honda(double[] loc)
	{
		location = loc;
	}
	
	public double getID()
	{
		ID = (int)(Math.random()*90000) + 100000;
		return ID;
	}
	
	public void move(double x, double y)
	{
		location[0] = x;
		location[1] = y;
	}
	
	public double[] getloc()
	{
		return location;
	}	
}	