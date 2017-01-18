public class UserNames
{
	private String userName, firstName, lastName;
	
	//default constructor
	public UserNames()
	{
		//default values for instance variables
		userName = "";
		firstName = "";
		lastName = "";
		
	}
	
	//constructor with params
	public UserNames(String uName, String fName, String lName)
	{
		userName = uName;
		firstName = fName;
		lastName = lName;
	}
	
	//Modifier
	public void setUserName(String uName)
	{
		userName = uName;
	}
	//Accessors
	public String getUserName()
	{
		return userName;
		
	}
	
	
	public String getFirstName()
	{
		return firstName;
		
	}
	
	
	public String getLastName()
	{
		return lastName;
		
	}
	
	public static void main(String[]args)
	{
		UserNames object = new UserNames("AleYoon", " Alessandra", "Yoon");
		
		System.out.println("<<<<<<<< USER INFO >>>>>>>>");
		System.out.println("Name: " + object.getFirstName() + " " + object.getLastName());
		System.out.println("User Name: " + object.getUserName());
	}
	
	
}