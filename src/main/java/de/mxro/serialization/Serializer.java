/*******************************************************************************
 * Copyright 2011 Max Erik Rohde http://www.mxro.de
 * 
 * All rights reserved.
 ******************************************************************************/
package de.mxro.serialization;

/**
 * <P>
 * A service which can serialize and deserialize Java objects.
 * <p>
 * Different implementations might or might not require objects to be
 * serializable.
 * 
 * @author <a href="http://www.mxro.de">Max Rohde</a>
 *
 * @param <SourceType>
 * @param <DestinationType>
 */
public interface Serializer<SourceType extends SerializationSource<?>, DestinationType extends SerializationDestination<?>> {

	/**
	 * Serializes a Java object into a {@link SerializationDestination}.
	 * 
	 * @param o The object to be serialized.
	 * @param dest The destionation where to the object is to be serialized.
	 * @return
	 */
	public boolean serialize(Object o, DestinationType dest);

	/**
	 * Deserializes a Java object from a {@link SerializationSource}
	 * 
	 * @param source The source from which the object is to be deserialized.
	 * @return The deserialized object.
	 */
	public Object deserialize(SourceType source);

}
