package crudpackage;

import java.io.File;

public class Remove implements Command {
	String fileName;
	int ID;
	
	Remove(String fileName, int ID) {
		this.fileName = fileName;
		this.ID = ID;
	}
	@Override
	public MessagePacket execute() {
		if(new File(fileName).delete()) {
			return new TextPacket("Deleted");
		} else {
			return new ErrorPacket("Failed to delete File");
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
