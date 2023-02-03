package crudpackage;

import java.net.*;
import java.io.*;

public class ConnectionHandler extends Thread{
	ObjectInputStream inputStream;
	ObjectOutputStream outputStream;
	Socket connectedSocket;
	
	public ConnectionHandler(Socket clientSocket) {
		try {
			this.connectedSocket = clientSocket;
			this.inputStream = new ObjectInputStream(clientSocket.getInputStream());
			this.outputStream = new ObjectOutputStream(clientSocket.getOutputStream());
			this.start();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		CommunicationPacket commandResult;
		boolean shouldRun = true;
			do {
				try {
					commandResult = ((Command) inputStream.readObject()).execute();
					outputStream.writeObject(commandResult);
				} catch(IOException e) {
					//TODO handle stream error
				} catch(ClassNotFoundException e) {
					//TODO handle request not of correct type
				}
			} while(shouldRun);
		System.out.printf("Client Disconnected");
	}
}
