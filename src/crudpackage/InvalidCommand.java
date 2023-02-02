package crudpackage;

public class InvalidCommand implements Command {

	InvalidCommand(){
		
	}
	@Override
	public Object execute() {
		return null;
	}

	@Override
	public int getCommandID() {
		return 0;
	}

	@Override
	public boolean isNull() {
		return true;
	}

}
