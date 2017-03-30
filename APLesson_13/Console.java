
public abstract class Console extends GameSystems
{ 
	private String controller; 
	
	public Console()
	{
		super();
	}
	
	public Console( String p)
	{
		super(p);
	}
	
	public abstract String getController();
	
	public String toString()
	{
		return "Platform: " + getPlatform() + "\nSerial #: " + getserialNo() + "\nController: " + getController();
	}
}