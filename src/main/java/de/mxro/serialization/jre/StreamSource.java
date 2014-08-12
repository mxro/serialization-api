package de.mxro.serialization.jre;

import java.io.InputStream;

import de.mxro.serialization.SerializationSource;

public class StreamSource implements SerializationSource<InputStream> {

	private final InputStream is;
	

	public StreamSource(InputStream is) {
		super();
		this.is = is;
	}

	@Override
	public InputStream getSource() {
		
		return is;
	}
	
	
	
}
