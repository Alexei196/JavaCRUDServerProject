package crudpackage;

public interface Command {
	public MessagePacket execute();
	public int getCommandID();
	public boolean isNull();
	public String toString();
}
