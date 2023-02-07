package crudpackage;

import java.io.*;
import java.util.ArrayList;

public class Read implements Command {
	String arg;
	int ID;
	
	Read(String arg, int ID) {
		this.arg = arg;
		this.ID = ID;
	}
	
	@Override
	public MessagePacket execute() {
		try {
			byte[] buffer = new byte[1024];
			ArrayList<byte[]> serializedFile = new ArrayList<byte[]>();
			FileInputStream fileStream = new FileInputStream(new File(arg));
			while(fileStream.available() >= 0) {
				fileStream.read(buffer);
				serializedFile.add(buffer);
			}
			return new FilePacket(serializedFile);
		} catch (IOException e) {
			return new ErrorPacket(String.format("File Read Failed: %s", e.getMessage()));
		} 
		
	}
	
	@Override
	public int getCommandID() {
		return ID;
	}

	@Override
	public boolean isInvalid() {
		return false;
	}
}
