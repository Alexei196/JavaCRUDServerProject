package crudpackage;

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
		return "message";
	}

}
