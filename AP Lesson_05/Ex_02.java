import java.util.Scanner; //import Statement

public class Ex_02
{
	static double savingsamount = 0;
	
	public static void main(String[]args)
	{
		Ex_02 form= new Ex_02();
		
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		
		//prompt for user input
		String item1 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		
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
		
		keyboard.nextLine();
		
		System.out.println("Please enter item 4:");
		
		//prompt for user input
		String item4 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		
		//search for next double that the user enters
		double price4 = keyboard.nextDouble();
		
		
		
		
		
		
		
		
		System.out.println("<<<<<<<<<<__Receipt__>>>>>>>>>>>");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		form.format(item4, price4);
		
		double subTotal = price1+price2 +price3 + price4;
		double Tax = subTotal* 0.08;
		savings(subTotal);
		double total = subTotal - savingsamount + Tax;
		form.format("Subtotal", subTotal);
		form.format("Tax", Tax);
		form.format("Savings ", savingsamount);
		form.format("Total", total);
		
		
		System.out.println("\n");
		System.out.println("* Thank you for your support *");
		
	}
	
	public static void savings(double subTotal)
	{
		boolean savings = subTotal >= 2000;
		
		if (savings)
		{
			savingsamount = .15 * subTotal;
			
		}
			
		if (!savings)
		{
			savingsamount = 0;
		}
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n%10s %10.2f", item, price);
	}
}