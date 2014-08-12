package de.mxro.serialization.jre;

import java.io.InputStream;

import de.mxro.serialization.Serializer;
import de.mxro.serialization.jre.internal.JavaSerializationProvider;

public class SerializationJre {

	/**
	 * A serializer based on Java's built in Serialization mechanism.
	 * 
	 * @return
	 */
	public static Serializer<StreamSource, StreamDestination> newJavaSerializer() {
	    return new JavaSerializationProvider();
	}

	public static StreamSource createStreamSource(InputStream is) {
		return new StreamSource(is);
	}

}
