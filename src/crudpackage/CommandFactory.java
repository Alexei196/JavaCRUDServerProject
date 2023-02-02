package crudpackage;

public class CommandFactory {
	int commandsIssued;
	CommandFactory(){
		commandsIssued = 0;
	}
	
	public Command parseCommandFromString(String parseString) {
		String[] splitString = parseString.split(" ");
		
 		switch(splitString[0]) {
		case "create":
			return new Create(splitString[1], commandsIssued++);
		case "read":
			return new Read(splitString[1], commandsIssued++);
		case "update":
			return new Update(splitString[1], splitString[2], commandsIssued++);
		case "delete":
			return new Remove(splitString[1], commandsIssued++);
		default: 
			return new InvalidCommand(parseString);
		}
	}
}
