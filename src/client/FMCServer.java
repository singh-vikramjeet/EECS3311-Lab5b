package client;

import autopilotModule.Autopilot;
import java.util.Scanner; 
import flightManagementComputer.FMCUnit;
import frontEnd.NavProxy;
import commandModule.*;
import factoryModule.CommandFactory;

public class FMCServer {

	public static void main(String[] args) {
		FMCUnit anFMCUnit = FMCUnit.getInstance();
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter 1 for Navigation ");
	    System.out.println("Enter 2 for Fuel Quantity Prediction at Landing ");
	    
	    System.out.print("Enter Selection: ");
	    

	    int selection = Integer.parseInt(myObj.nextLine());  // Read user input
	    
	    CommandFactory aCFactory = CommandFactory.getInstance();
	    Command aCommand = aCFactory.create(selection);
	    anFMCUnit.setFMCUnitCommand(aCommand);
	    

		anFMCUnit.execute();
		
	}
}
