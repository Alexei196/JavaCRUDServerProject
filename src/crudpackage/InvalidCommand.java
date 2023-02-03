package crudpackage;

public class InvalidCommand implements Command {
	String args;
	InvalidCommand(String args){
		this.args = args;
	}
	@Override
	public CommunicationPacket execute() {
		return null;
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
