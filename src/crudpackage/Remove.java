package crudpackage;

public class Remove implements Command {
	String fileName;
	int ID;
	
	Remove(String fileName, int ID) {
		this.fileName = fileName;
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
