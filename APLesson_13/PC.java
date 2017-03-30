public class PC extends GameSystems
{ 
	private String controller; 
	
	public PC()
	{
		super();
	}
	
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
		return "Platform: " + getPlatform() + "\nSerial #: " + getserialNo() + "\nSystem Input: " + systemInput();
	}
}