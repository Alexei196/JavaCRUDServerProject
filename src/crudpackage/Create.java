package crudpackage;

public class Create implements Command {
	String arg;
	int ID;
	
	Create(String arg, int ID){
		this.arg = arg;
		this.ID = ID;
	}
	@Override
	public String execute() {
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
