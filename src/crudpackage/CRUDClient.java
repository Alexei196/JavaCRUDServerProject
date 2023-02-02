package crudpackage;

import java.net.*;
import java.io.*;

public class CRUDClient {
	
	public static void main(String[] args) {
		try {
			Socket connectedSocket = new Socket(args[0], Integer.parseInt(args[1]));
			DataInputStream inputStream = new DataInputStream(connectedSocket.getInputStream());
			DataOutputStream outputStream = new DataOutputStream(connectedSocket.getOutputStream());
		} catch(IOException e) {
			
		}
		
	}

}
