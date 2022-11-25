package com.edocode.dp.creational.factorymethod;

import com.edocode.dp.creational.factorymethod.message.*;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}

}
