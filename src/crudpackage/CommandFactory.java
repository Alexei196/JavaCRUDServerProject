package crudpackage;

public class CommandFactory {
	
	CommandFactory(){
		
	}
	
	public Command parseCommandFromString(String parseString) {
		String[] splitString = parseString.split(" ");
		
 		switch(splitString[0]) {
		case "create":
			return new Create(splitString[1]);
		case "read":
			return new Read(splitString[1]);
		case "update":
			return new Update(splitString[1], splitString[2]);
		case "delete":
			return new Remove(splitString[1]);
		default: 
			return new InvalidCommand();
		}
	}
}
