package crudpackage;

public class InvalidCommand implements Command {
	String args;
	InvalidCommand(String args){
		this.args = args;
	}
	@Override
	public String execute() {
		return String.format("\"%s\"is an invalid command!", args);
	}

	@Override
	public int getCommandID() {
		return -1;
	}

	@Override
	public boolean isNull() {
		return true;
	}

}
