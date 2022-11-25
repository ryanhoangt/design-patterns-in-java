package com.edocode.dp.creational.factorymethod;

import com.edocode.dp.creational.factorymethod.message.*;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}
	
}
