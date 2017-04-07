import java.lang.Math.*;
import java.util.ArrayList;
public class Honda1 extends Car1os
{
	private double xx, yy;
	
	public Honda1(double [] ale)
	{
		super();
		move(ale[0], ale[1]);
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