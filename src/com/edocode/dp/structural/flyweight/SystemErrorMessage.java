package com.edocode.dp.structural.flyweight;

//A concrete Flyweight. Instance is shared
public class SystemErrorMessage implements ErrorMessage {

	// Intrinsic states
	private String messageTemplate;	// some error message $errorCode
	private String helpUrlBase; // http://somedomain.com/help?error=...
	
	public SystemErrorMessage(String messageTemplate, String helpUrlBase) {
		super();
		this.messageTemplate = messageTemplate;
		this.helpUrlBase = helpUrlBase;
	}

	@Override
	public String getText(String code) { // Extrinsic states are provided.
		return messageTemplate.replace("$errorCode", code)
				+ helpUrlBase + code;
	}
}
