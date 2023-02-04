package crudpackage;

import java.net.*;
import java.io.*;

public class CRUDClient {
	//Arg 0 is hostname, arg 1 is port
	public static void main(String[] args) {
		try {
			Socket connectedSocket = new Socket(args[0], Integer.parseInt(args[1]));
			ObjectInputStream inputStream = new ObjectInputStream(connectedSocket.getInputStream());
			ObjectOutputStream outputStream = new ObjectOutputStream(connectedSocket.getOutputStream());
			
			String consoleInput;
			CommandFactory commandFactory = new CommandFactory();
			do {
				consoleInput = System.console().readLine("Please enter a command: ");
				try {
					Command requestedCommand = commandFactory.parseCommandFromString(consoleInput);
					if(!requestedCommand.isNull()) {
						outputStream.writeObject(requestedCommand);
						MessagePacket serverResponse = (MessagePacket) inputStream.readObject();
						System.out.printf("Server Response: %s", serverResponse.toString());
					}
					else System.out.printf("Invalid Command: \"%s\"", requestedCommand.toString());
				} catch(IOException e) {
					//TODO handle stream error
				} catch(ClassNotFoundException e) {
					//TODO handle response not of correct type
				}
			} while(!consoleInput.equals("exit"));
			
		} catch(IOException e) {
			//TODO handle failed stream init
		} catch(NumberFormatException e) {
			//TODO handle failed to parse int
		} 
			
		
	}

}
