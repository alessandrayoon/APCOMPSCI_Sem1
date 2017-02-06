public class CountingMachine
{
	public static void main(String[]args)
	{
		ArrayList<Money> inventory = new ArrayList<Money>();
		inventory.add(new Coin ("Penny", 2.5, 00.01));
		inventory.add(new Coin ("Nickel", 5.0, 00.05));
		inventory.add(new Bill ("One", "Washington", 01.00));
		inventory.add(new Bill ("Five", "Lincoln", 05.00));
		
		for(Money x : inventory)
		{
			System.out.println(x);
		}
		
	}

	
}