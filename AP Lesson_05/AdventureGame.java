import java.util.Scanner;
public class AdventureGame
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Oh no! You lost your phone! Where do you look?" +
							"\n1. I'll look in my car." + 
							"\n2. Maybe I forgot it in my class.");
		int choice1 = kb.nextInt();
		if (choice1 == 1)
		{
			System.out.println("Nope, not there. Hmmmmmmm, where else can you look?" + 
								"\n1. What if I left it in my friend's car?  " + 
								"\n2. Duh, I'll just check my bag. ");
			int choice2 = kb.nextInt();
			if (choice2 == 1)
			{	
				System.out.println("What?!?! It's not there either.  Now what do you do?" +
									"\n1. I guess I can see if I left it at home." + 
									"\n2. Oh well that's too bad. I give up.");
				int choice3 = kb.nextInt();
				if (choice3 == 1)
				{
					System.out.println("Hey! You found it congrats!! Saved yourself from your parent's wrath. ");
				}
				else
					System.out.println("Better go find the nearest Apple store to get a new one. ");
			}	
			else 
			{
				System.out.println("What?!?! It's not there either.  Now what do you do?" +
									"\n1.I guess I can see if I left it at home." + 
									"\n2. Oh well that's too bad. I give up.");
				int choice3 = kb.nextInt();
				if (choice3 == 1)
				{
					System.out.println("Hey! You found it congrats!! Saved yourself from your parent's wrath.");
				}
				else
					System.out.println("Better go find the nearest Apple store to get a new one.");
			}
		}
		else
		{
			System.out.println("Nope, not there. Hmmmmmmm, where else can you look?" + 
								"\n1. What if I left it in my friend's car?" + 
								"\n2. Duh, I'll just check my bag. ");
			int choice2 = kb.nextInt();
			if (choice2 == 1)
			{	
				System.out.println("What?!?! It's not there either.  Now what do you do?" +
									"\n1.I guess I can see if I left it at home." + 
									"\n2. Oh well that's too bad. I give up.");
				int choice3 = kb.nextInt();
				if (choice3 == 1)
				{
					System.out.println("Hey! You found it congrats!! Saved yourself from your parent's wrath.");
				}
				else
					System.out.println("Better go find the nearest Apple store to get a new one.");
			}	
			else 
			{
				System.out.println("What?!?! It's not there either.  Now what do you do?" +
									"\n1. I guess I can see if I left it at home." + 
									"\n2. Oh well that's too bad. I give up.");
				int choice3 = kb.nextInt();
				if (choice3 == 1)
				{
					System.out.println("Hey! You found it congrats!! Saved yourself from your parent's wrath.");
				}
				else
					System.out.println("Better go find the nearest Apple store to get a new one.");
			}
		}
	}
}