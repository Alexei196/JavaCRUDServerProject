package crudpackage;

public interface Command {
	public String execute();
	public int getCommandID();
	public boolean isNull();
}
