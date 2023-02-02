package crudpackage;

import java.net.*;
import java.io.*;

public class CRUDClient {
	
	public static void main(String[] args) {
		try {
			Socket connectedSocket = new Socket(args[0], Integer.parseInt(args[1]));
			DataInputStream inputStream = new DataInputStream(connectedSocket.getInputStream());
			DataOutputStream outputStream = new DataOutputStream(connectedSocket.getOutputStream());
			
			String consoleInput;
			do {
				consoleInput = System.console().readLine("Please enter a command: ");
				outputStream.writeUTF(consoleInput);
				System.out.println("Response: " + inputStream.readUTF());
			} while(!consoleInput.equals("exit"));
		} catch(IOException e) {
			
		}
		
	}

}
