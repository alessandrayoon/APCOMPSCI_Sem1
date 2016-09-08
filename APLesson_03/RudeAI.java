import java.util.Scanner; //imort Statement

public class RudeAI
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi, my name is RudeAI. I'd like to ask you a few questionhs.");
		
		//prompt for user input
		System.out.println("What is your name? ");
		
		String teacher = keyboard.next();
		
		//print the results...
		System.out.println("That's the best your parents could do?");
		
		//prompt for user input
		System.out.println("How old are you?");
		
	}		
}		