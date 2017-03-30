public class PC extends GameSystem
{		
	public PC(String p)
	{
		super(p);
		
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	
	public String toString()
	{
		return "Platform: " + platform + "\nSerial #: " + getsN()+ "\nSystem Input: " + systemInput() + "\n";
	}
}