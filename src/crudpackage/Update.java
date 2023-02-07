package crudpackage;

import java.util.ArrayList;

public class Update implements Command {
	String fileName;
	ArrayList<byte[]> serializedFile;
	int ID; 
	
	Update(String fileName, ArrayList<byte[]> serializedFile, int ID){
		this.fileName = fileName;
		this.serializedFile = serializedFile;
		this.ID = ID;
	}
	@Override
	public MessagePacket execute() {
		// TODO Auto-generated method stub
		return null;
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
