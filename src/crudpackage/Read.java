package crudpackage;

public class Read implements Command {
	String arg;
	int ID;
	
	Read(String arg, int ID) {
		this.arg = arg;
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
