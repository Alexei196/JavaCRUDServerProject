package crudpackage;

import java.net.*;
import java.io.*;

public class CRUDServer {
	int maxConnections = 8; 
	public static void main(String[] args) {
		int currentConnections = 0;
		try {
			ServerSocket serverSocket = new ServerSocket(Integer.parseInt(args[0]));
			System.out.printf("Hosted on %s:%d", serverSocket.getInetAddress().getHostAddress(), serverSocket.getLocalPort());
			while(true) {
				Socket clientSocket = serverSocket.accept();
				ConnectionHandler newClientConnection = new ConnectionHandler(clientSocket);
				System.out.printf("Client %d Connected\n", ++currentConnections);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
