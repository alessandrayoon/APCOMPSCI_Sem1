import java.util.Scanner; //imort Statement

public class Lesson_03
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("How old are you? ");
		
		//seach for the next integer that user enters
		int num = keyboard.nextInt();
		
		//print the results...
		System.out.println("Wow! " + num + " is perfect. You're pretty handsome. ");
		
		//prompt for user input
		System.out.println("Who is your favorite teacher? ");
		
		String teacher = keyboard.next();
		
		System.out.println("Okay!" + teacher + " is very good!");
		
	}
}