package crudpackage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CommandFactory {
	int commandsIssued;
	CommandFactory(){
		commandsIssued = 0;
	}
	
	public Command parseCommandFromString(String parseString) {
		String[] splitString = parseString.split(" ");
		
 		switch(splitString[0].toLowerCase().trim()) {
		case "create":
		case "upload":
			try {
				return new Create(splitString[1], parseBytesFromFile(splitString[1]), commandsIssued++);
			} catch (FileNotFoundException e1) {
				return new InvalidCommand(parseString);
			} catch (IOException e1) {
				return new InvalidCommand(parseString);
			}
		case "read":
		case "fetch":
			return new Read(splitString[1], commandsIssued++);
		case "update":
			try {
				return new Update(splitString[1], parseBytesFromFile(splitString[2]), commandsIssued++);
			} catch (FileNotFoundException e) {
				return new InvalidCommand(parseString);
			} catch (IOException e) {
				return new InvalidCommand(parseString);
			}
		case "delete":
		case "remove":
			return new Remove(splitString[1], commandsIssued++);
		default: 
			return new InvalidCommand(parseString);
		}
	}
	
	private ArrayList<byte[]> parseBytesFromFile(String filePath) throws FileNotFoundException, IOException {
		
		byte[] buffer = new byte[1024];
		ArrayList<byte[]> fileContentBuffer = new ArrayList<byte[]>();
		FileInputStream fileReader = new FileInputStream(new File(filePath));
		
		while(fileReader.available() >= 0) {
			fileReader.read(buffer);
			fileContentBuffer.add(buffer);
		}
		
		return null;
	}
}
