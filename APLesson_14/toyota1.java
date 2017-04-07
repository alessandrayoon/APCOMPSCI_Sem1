import java.lang.Math.*;
import java.util.ArrayList;
import java.util.Arrays;
public class toyota1 extends Car1os
{
	private double xx, yy;

	public toyota1(String meghan)
	{
		super();
		ArrayList<String> position = new ArrayList<>(Arrays.asList(meghan.split(", ")));
		Double meghanX = Double.parseDouble(position.get(0));
		Double meghanY = Double.parseDouble(position.get(1));
		move(meghanX, meghanY);
	}
		
	public void move(double x, double y)
	{
		this.xx += x;
		this.yy += y;
	}
	
	public double[] getLoc()
	{
		double[] location = {xx,yy};
		return location;
	}		
}	