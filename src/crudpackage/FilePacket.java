package crudpackage;

import java.util.ArrayList;

public class FilePacket implements MessagePacket {
	ArrayList<byte[]> fileByteArray;
	FilePacket(ArrayList<byte[]> fileByteArray){
		this.fileByteArray = fileByteArray;
	}
	@Override
	public Object getPayload() {
		return fileByteArray;
	}

	@Override
	public String getMessageType() {
		return "file";
	}

}
