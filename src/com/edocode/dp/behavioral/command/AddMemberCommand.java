package com.edocode.dp.behavioral.command;

// A Concrete implementation of Command.
public class AddMemberCommand implements Command {

	private String emailAddress;
	private String listName;
	private EWSService receiver;
	
	public AddMemberCommand(String emailAddress, String listName, EWSService receiver) {
		super();
		this.emailAddress = emailAddress;
		this.listName = listName;
		this.receiver = receiver; // optinal, can be located at runtime
	}

	@Override
	public void execute() {
		receiver.addMember(emailAddress, listName);
	}
}
