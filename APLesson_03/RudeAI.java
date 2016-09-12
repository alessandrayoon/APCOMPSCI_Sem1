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
		
		String name = keyboard.next();
		
		//print the results...
		System.out.println("That's the best your parents could do?");
		
		//prompt for user input
		System.out.println("How old are you, " + name + "?");
		
		//search for the next integer that the user enters
		int num = keyboard.nextInt();
		
		//print the results...
		System.out.println("Ooooo!!!" + num + " is getting up there.");
		
		
		//prompt for user input
		System.out.println("What do you do for fun, " + name + "?");
		
		String fun = keyboard.next();
		
		//print the results...
		System.out.println("I thought only nerds like to " + fun + "?" );
		
		
		//prompt for user input
		System.out.println("What kind of music do you like?");
		
		String music = keyboard.next();
		
		//print the results...
		System.out.println("Booo!!! I wouldn't wish the sound of " + music + " on my worst enemy!" );
		
		//prompt for user input
		System.out.println("How many siblings do you have?");
		
		int sib = keyboard.nextInt();
		
		//print the results...
		System.out.println( sib + "?" + " Wow, I hope the rest of your family is better looking. ");
		
		//prompt for user input
		System.out.println("What do you want to be when you grow up?");
		
		String grow = keyboard.next();
		
		//print the results...
		System.out.println(" I think you'd have to be smarter to be a " + grow + ". So " + name + ", you're " + num + "... You like to " + fun + " and listen to " + music + "...Good luck becoming a " + grow + ". I'm only kiddin' " + name + ".");
		
		
		
		
		
	}		
}		