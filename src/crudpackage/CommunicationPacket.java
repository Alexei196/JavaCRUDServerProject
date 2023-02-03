package crudpackage;

import java.io.File;

public interface CommunicationPacket {
	public File getPayload();
	public String getMessageType();
	public String toString();
}
