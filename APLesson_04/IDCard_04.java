import java.util.Scanner; //import Statement

public class IDCard_04
{
	public static void main(String[]args)
	{
		IDCard_04 form= new IDCard_04();
		
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		
		//prompt for user input
		String first = keyboard.nextLine();
		
	    System.out.println("Enter your last name:");
	
		//prompt for user input
		String last = keyboard.nextLine();
		
		System.out.println("Enter your title:");
		
		//prompt for user input
		String title = keyboard.nextLine();
		
		System.out.println("Enter the school site:");
		
		//prompt for user input
		String site = keyboard.nextLine();
		
		System.out.println("Enter the school year:");
	   
	   //prompt for user input
		int year = keyboard.nextInt();
		
	   System.out.println("What is your subject?");
	   
	   keyboard.nextLine();
	   
	   //prompt for user input
		String subject = keyboard.nextLine();
		
		System.out.println("********************");
		form.card(first, last, title, site, year, subject);
		System.out.println("\n");
		System.out.println("********************");
		
	}
	public void card(String first, String last, String title, String site, int year, String subject)
	{
		System.out.printf("*%s %13s* \n*%s %9s* \n*%s %13s*", first, last , title,  site, year, subject);
	}
	
}
	