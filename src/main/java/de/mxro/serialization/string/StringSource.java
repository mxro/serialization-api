package de.mxro.serialization.string;

import de.mxro.serialization.SerializationSource;

public class StringSource implements SerializationSource<String> {

	private final String string;

	@Override
	public String getSource() {
		return string;
	}

	public StringSource(String string) {
		super();
		this.string = string;
	}

	
	
}
