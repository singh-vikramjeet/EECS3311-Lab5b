package commandModule;
import java.util.Scanner;

import frontEnd.*;
import receiver.*;

public class NavigationCommand extends Command {
	
	
	private int nextLat;
	private int nextLong;
	
	public NavigationCommand(int nextLat, int nextLon) {
		super();
		this.nextLat = nextLat;
		this.nextLong = nextLon;
	}
	
	public NavigationCommand() {
		super();
		this.nextLat = 0;
		this.nextLong = 0;
		
	}

	public Result doAction() {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Navigation Option Selected");
   	
    	System.out.print("Enter Target Latitude: ");
    	String selectionLat = myObj.nextLine();
     	System.out.print("Enter Target Longitude: ");
    	String selectionLong =  myObj.nextLine();
    	nextLong = Integer.parseInt(selectionLong);
    	nextLat = Integer.parseInt(selectionLat);
 
		NavProxy aProxy = NavProxy.getInstance();
		NavigationReceiver aReceiver = new NavigationReceiver();
		Result aResult = aReceiver.perform(this, aProxy);
		return aResult;
		
	}

	public int getNextLat() {
		return nextLat;
	}

	public void setNextLat(int nextLat) {
		this.nextLat = nextLat;
	}

	public int getNextLong() {
		return nextLong;
	}

	public void setNextLong(int nextLong) {
		this.nextLong = nextLong;
	}

}
