package de.mxro.serialization.jre;

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

}
