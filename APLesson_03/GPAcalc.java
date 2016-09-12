import java.util.Scanner; //imort Statement

public class GPAcalc
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi. My name is GPAcalculator.");
		
		//prompt for user input
		System.out.println("In classes, an A correlates to a 4, a B corrleates to a 3, a C correlates to a 2, a D correlates to a 1 and an F correlates to a zero. May I ask for the corresponding number to your grade in your first class?");
		
		//search for next integer that the user enters
		int classone = keyboard.nextInt();
		
		//prompt for user input
		System.out.println("May I ask for the corresponding number to the grade in your second class?");
		
		//search for next integer that the user enters
		int classtwo = keyboard.nextInt();
		
		//prompt for user input
		System.out.println("May I ask for the corresponding number to the grade in your third class?");
		
		//search for next integer that the user enters
		int classthree = keyboard.nextInt();
		
		//prompt for user input
		System.out.println("May I ask for the corresponding number to the grade in your fourth class?");
		
		//search for next integer that the user enters
		int classfour = keyboard.nextInt();
		
		//prompt for user input
		System.out.println("May I ask for the corresponding number to the grade in your fifth class?");
		
		//search for next integer that the user enters
		int classfive = keyboard.nextInt();
		
		//prompt for user input
		System.out.println("May I ask for the corresponding number to the grade in your sixth class?");
		
		//search for next integer that the user enters
		int classsix = keyboard.nextInt();
		
		float GPA = (classone + classtwo + classthree + classfour + classfive + classsix)/(6);
		System.out.println(GPA);
		
	}
}
