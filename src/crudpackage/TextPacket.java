package crudpackage;

import java.io.File;

public class TextPacket implements MessagePacket {
	String message;
	TextPacket(String message) {
		this.message = message;
	}
	@Override
	public Object getPayload() {
		return message;
	}

	@Override
	public String getMessageType() {
		// TODO Auto-generated method stub
		return null;
	}

}
