public class GameRunner
{
	public static void main(String[]args)
	{
		PlayStation alessandra = new PlayStation("playstation");
		XBox meghan = new XBox("Xbox");
		PC josh = new PC("PvZ");
		
		System.out.println(alessandra.toString());
		System.out.println(meghan.toString());
		System.out.println(josh.toString());
	}
}