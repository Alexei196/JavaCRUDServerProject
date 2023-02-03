package crudpackage;

import java.io.File;

public class Upload implements Command {
	File newFile;
	int ID;
	
	Upload(File newFile, int ID){
		this.newFile = newFile;
		this.ID = ID;
	}
	@Override
	public CommunicationPacket execute() {
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
