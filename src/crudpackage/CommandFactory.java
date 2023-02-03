package crudpackage;

import java.io.*;

public class CommandFactory {
	int commandsIssued;
	CommandFactory(){
		commandsIssued = 0;
	}
	
	public Command parseCommandFromString(String parseString) {
		String[] splitString = parseString.split(" ");
		
 		switch(splitString[0].toLowerCase().trim()) {
		case "create":
			return new Create(splitString[1], commandsIssued++);
		case "upload":
			return new Upload(new File(splitString[1]), commandsIssued);
		case "read":
			return new Read(splitString[1], commandsIssued++);
		case "update":
			return new Update(splitString[1], new File(splitString[2]), commandsIssued++);
		case "delete":
			return new Remove(splitString[1], commandsIssued++);
		default: 
			return new InvalidCommand(parseString);
		}
	}
}
