import java.lang.Math.*;
import java.util.ArrayList;
public class StudentAdvance extends Advance
{
	private int daysleft;
	public StudentAdvance()
	{
		super();
		daysleft = 0;
	}
	
	public StudentAdvance(int dl)
	{
		super();
		daysleft = dl;
	}
	
	public double getprice()
	{
		return super.getprice()/2;
	}
	
	public String toString()
	{
		return super.toString() + "\n(STUDENT ID REQUIRED)";
	}
}