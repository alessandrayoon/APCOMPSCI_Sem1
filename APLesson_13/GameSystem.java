import java.lang.Math.*;
public class GameSystems
{
	private String platform;
	private int serialNo;
	
	public GameSystems()
	{
		this.platform = "";
		this.serialNo = (int)(Math.random()*900000) + 1000000;
	}
	
	public GameSystems(String p)
	{
		this.platform = p;
		this.serialNo = (int)(Math.random()*900000) + 1000000;
	}	

	public String getPlatform()
	{
		return platform;
	}
	
	public int getserialNo()
	{
		return serialNo;
	}
}