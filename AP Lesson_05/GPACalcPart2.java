import java.util.Scanner;

public class GPACalcPart2
{
	static double gradePoints = 0.0;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your letter grade in science");
		
		String science = keyboard.next();
		
		System.out.println("Please enter your letter grade in math");
		
		String math = keyboard.next();
		
		System.out.println("Please enter your letter grade in english");
		
		String english = keyboard.next();
		
		System.out.println("Please enter your letter grade in economy");
		
		String economy = keyboard.next();
		
		System.out.println("Please enter your letter grade in government");
		
		String government = keyboard.next();
		
		System.out.println("Please enter your letter grade in physics");
		
		String physics = keyboard.next();
		
		System.out.println("Please enter your letter grade in psychology");
		
		String psychology = keyboard.next();
		
		
		
		double gradePoints = calcPoints(science) + calcPoints(math) + calcPoints(economy) + calcPoints(government) + calcPoints(physics) + calcPoints(psychology) + calcPoints(english);
		
		double GPA = gradePoints/7;
		
		System.out.println("Your GPA is " + GPA);
	}
	
	public static double calcPoints(String grade)
	{
		
		if(grade.equals("A"))
			gradePoints = 4.0;
		
		
		if(grade.equals("B"))
			gradePoints = 3.0;
		
		
		if(grade.equals("C"))
			gradePoints = 2.0;
		
		
		if(grade.equals("D"))
			gradePoints = 1.0;
		
		
		if(grade.equals("F"))
			gradePoints = 0.0;
		
		return gradePoints;
		
	}
}