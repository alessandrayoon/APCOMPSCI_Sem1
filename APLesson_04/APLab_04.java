import java.util.Scanner; //import Statement

public class APLab_04
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		
		//prompt for user input
		String item1 = keyboard.nextLine();
		
		System.out.println("Please ener the price:");
		
		//search for next double that the user enters
		double price1 = keyboard.nextDouble();
		keyboard.nextLine();
		
		System.out.println("Please enter item 2:");
		
		//prompt for user input
		String item2 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		
		//search for next double that the user enters
		double price2 = keyboard.nextDouble();
		keyboard.nextLine();
		
		
		System.out.println("Please enter item 3:");
		
		//prompt for user input
		String item3 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		
		//search for next double that the user enters
		double price3 = keyboard.nextDouble();
		
		
		
		
		
		
		
		
		System.out.println("<<<<<<<<<<__Receipt__>>>>>>>>>>>");
		form.format(word1, price1);
		form.format(word2, price2);
		form.format(word3, price3);
		
		double subTotal = price1+price2 +price3;
		double Tax = subTotal* 0.08;
		double total = subTotal+ tax;
		form.format("Subtotal", subTotal);
		form.format("Tax", Tax);
		form.format("Total", total);
		
		
		
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n%10s %10.2f", item, price);
	}
}