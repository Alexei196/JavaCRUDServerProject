package crudpackage;

import java.net.*;
import java.io.*;

public class CRUDServer {

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(Integer.parseInt(args[0]));
			
			while(true) {
				Socket clientSocket = serverSocket.accept();
				ConnectionHandler newClientConnection = new ConnectionHandler(clientSocket);
				System.out.println("Client Connected");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
