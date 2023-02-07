package crudpackage;

public class InvalidCommand implements Command {
	String args;
	InvalidCommand(String args){
		this.args = args;
	}
	@Override
	public MessagePacket execute() {
		return null;
	}

	@Override
	public int getCommandID() {
		return -1;
	}

	@Override
	public boolean isInvalid() {
		return true;
	}

}
