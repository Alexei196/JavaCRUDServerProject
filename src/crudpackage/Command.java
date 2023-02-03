package crudpackage;

public interface Command {
	public CommunicationPacket execute();
	public int getCommandID();
	public boolean isNull();
	public String toString();
}
