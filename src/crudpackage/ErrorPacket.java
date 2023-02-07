package crudpackage;

public class ErrorPacket implements MessagePacket {
	String errorMessage;
	public ErrorPacket(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public Object getPayload() {
		return errorMessage;
	}

	@Override
	public String getMessageType() {
		return "error";
	}

}
