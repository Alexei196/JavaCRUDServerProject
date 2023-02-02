package crudpackage;

import java.net.*;
import java.io.*;

public class ConnectionHandler extends Thread{
	DataInputStream inputStream;
	DataOutputStream outputStream;
	Socket connectedSocket;
	
	public ConnectionHandler(Socket clientSocket) {
		try {
			this.connectedSocket = clientSocket;
			this.inputStream = new DataInputStream(clientSocket.getInputStream());
			this.outputStream = new DataOutputStream(clientSocket.getOutputStream());
			this.start();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		try {
			String input;
			do {
				input = inputStream.readUTF();
				//TODO parse command from input
				//TODO execute command
				//TODO return command result to outputStream
			} while(input != null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
