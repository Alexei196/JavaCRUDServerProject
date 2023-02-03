package crudpackage;

import java.io.File;

public class Update implements Command {
	String fileName;
	File newContents;
	int ID; 
	
	Update(String fileName, File newFile, int ID){
		this.fileName = fileName;
		this.newContents = newContents;
		this.ID = ID;
	}
	@Override
	public CommunicationPacket execute() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCommandID() {
		return ID;
	}

	@Override
	public boolean isNull() {
		return false;
	}

}
