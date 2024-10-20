import java.util.Scanner;

public class Automobile {
	
	// initialize private variables
	private String autoMakePrivate = null;
	private String autoColorPrivate = null;
	private int autoYearPrivate = 0;
	
	
	// create String method that checks if the parameters match the private variables
	public String RemoveVehicle(String autoMake, String autoColor, int autoYear)
	{
		if (autoMake.equals(autoMakePrivate) && autoColor.equals(autoColorPrivate) && autoYear == autoYearPrivate)
		{
			// if it matches, remvoe the vehicle information
			RemoveVehicleInformation();
			return "Vehicle information matches, removing vehicle information";
		}
		else
		{
			return "Information entered does not match";	
		}
		
	}
	
	public void RemoveVehicleInformation()
	{
		SetAutoMake(null);
		SetAutoColor(null);
		SetAutoYear(0);
	}
	
	public String getAutoMake()
	{
		return autoMakePrivate;
	}
	
	public String getAutoColor()
	{
		return autoColorPrivate;
	}
	
	public int getAutoYear()
	{
		return autoYearPrivate;
	}
	
	public void SetAutoMake(String make)
	{
		autoMakePrivate = make;
	}
	
	public void SetAutoColor(String color)
	{
		autoColorPrivate = color;
	}
	
	public void SetAutoYear(int year)
	{
		autoYearPrivate = year;
	}
	
	public static void main(String args[])
	{
		Automobile automobile = new Automobile();
		
		automobile.SetAutoColor("Black");
		automobile.SetAutoMake("Ford");
		automobile.SetAutoYear(2004);
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Private variables for this automobile class include: " + automobile.getAutoMake() + " " + automobile.getAutoColor() + " " + automobile.getAutoYear());
		
		System.out.println("Please enter vehicle information:");
		
		System.out.println("Testing removal of information for this vehicle: " + automobile.RemoveVehicle(userInput.nextLine(), userInput.nextLine(), userInput.nextInt()));
		
		System.out.println(automobile.getAutoMake() + " " + automobile.getAutoColor() + " " + automobile.getAutoYear());
	}
	
	
	
	
}
