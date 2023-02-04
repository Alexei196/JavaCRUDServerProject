package crudpackage;

import java.util.ArrayList;

public class Upload implements Command {
	ArrayList<byte[]> serializedFile;
	int ID;
	
	Upload(ArrayList<byte[]> serializedFile, int ID){
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
		return 0;
	}

	@Override
	public boolean isNull() {
		return false;
	}

}
