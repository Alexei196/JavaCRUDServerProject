package crudpackage;

public class Create implements Command {
	String newFile;
	int ID;
	
	Create(String newFile, int ID){
		this.newFile = newFile;
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
	public boolean isNull() {
		return false;
	}

}
