package crudpackage;

import java.net.*;
import java.io.*;

public class CRUDClient {
	
	public static void main(String[] args) {
		try {
			Socket connectedSocket = new Socket(args[0], Integer.parseInt(args[1]));
			ObjectInputStream inputStream = new ObjectInputStream(connectedSocket.getInputStream());
			ObjectOutputStream outputStream = new ObjectOutputStream(connectedSocket.getOutputStream());
			
			String consoleInput;
			CommandFactory commandFactory = new CommandFactory();
			do {
				consoleInput = System.console().readLine("Please enter a command: ");
				Command requestedCommand = commandFactory.parseCommandFromString(consoleInput);
				if(!requestedCommand.isNull()) outputStream.writeObject(requestedCommand);
				else System.out.printf("Invalid Command: \"%s\"", requestedCommand.toString());
			} while(!consoleInput.equals("exit"));
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
