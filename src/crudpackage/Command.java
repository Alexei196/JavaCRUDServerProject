package crudpackage;

public interface Command {
	public Object execute();
	public int getCommandID();
	public boolean isNull();
}
