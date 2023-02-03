package crudpackage;

public class Update implements Command {
	String fileName;
	String newContents;
	int ID; 
	
	Update(String fileName, String newContents, int ID){
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
