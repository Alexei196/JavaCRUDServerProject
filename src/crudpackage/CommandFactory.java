package crudpackage;

import java.io.*;
import java.util.ArrayList;

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
			return new Upload(parseBytesFromFile(splitString[1]), commandsIssued);
		case "read":
			return new Read(splitString[1], commandsIssued++);
		case "update":
			return new Update(splitString[1], parseBytesFromFile(splitString[2]), commandsIssued++);
		case "delete":
			return new Remove(splitString[1], commandsIssued++);
		default: 
			return new InvalidCommand(parseString);
		}
	}
	
	private ArrayList<byte[]> parseBytesFromFile(String filePath) {
		
	}
}
