package de.mxro.serialization.internal;

import java.io.OutputStream;

import de.mxro.serialization.SerializationDestination;

public class StreamDestination implements SerializationDestination<OutputStream> {

	private final OutputStream os;


	public StreamDestination(OutputStream os) {
		super();
		this.os = os;
	}

	@Override
	public OutputStream getDestination() {
		return os;
	};

}
