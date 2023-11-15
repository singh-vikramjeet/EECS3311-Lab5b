package factoryModule;

import commandModule.*;

public class CommandFactory {
	
	private static CommandFactory instance = null;
	
	
	
	private CommandFactory CommandFactory() {
		return CommandFactory();
	}
	

	public static CommandFactory getInstance() {
		if(instance == null) {
			instance = new CommandFactory();
		}
		return instance;
	}
	
	public Command create(int selection) {
		Command result = null;
		if(selection == 1) {
			result = new NavigationCommand();
		}
		else if(selection == 2) {
			result = new FuelPredictionCommand();
		}
		
		return result;
	}

}
