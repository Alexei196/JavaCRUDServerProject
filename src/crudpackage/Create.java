package crudpackage;

import java.io.*;
import java.util.ArrayList;

public class Create implements Command {
	ArrayList<byte[]>  newFile;
	String fileName;
	int ID;
	
	Create(String fileName, ArrayList<byte[]> arrayList, int ID){
		this.newFile = arrayList;
		this.fileName = fileName;
		this.ID = ID;
	}
	@Override
	public MessagePacket execute() {
		try {
			FileOutputStream fileStream = new FileOutputStream(new File(fileName));
			for(byte[] byteArray : newFile) {
				fileStream.write(byteArray);
			}
			return new TextPacket("File Upload Success");
		}catch(IOException e) {
			return new ErrorPacket(String.format("File Upload Failed: %s\n", e.getMessage()));
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
