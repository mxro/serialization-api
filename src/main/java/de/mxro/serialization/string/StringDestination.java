package de.mxro.serialization.string;

import de.mxro.serialization.SerializationDestination;

public class StringDestination implements SerializationDestination<StringValue> {

	private final StringValue value;

	@Override
	public StringValue getDestination() {
		return value;
	}

	public StringDestination() {
		super();
		this.value = new StringValue();
		
	}

	
	
}
