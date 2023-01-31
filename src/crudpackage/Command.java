package crudpackage;

public interface Command {
	public Object execute(String[] args);
	public int getCommandID();
}
