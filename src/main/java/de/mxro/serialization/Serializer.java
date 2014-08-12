/*******************************************************************************
 * Copyright 2011 Max Erik Rohde http://www.mxro.de
 * 
 * All rights reserved.
 ******************************************************************************/
package de.mxro.serialization;



/**
 * 
 * @author Max Rohde
 * 
 */
public interface Serializer<SourceType extends SerializationSource<?>, DestinationType extends SerializationDestination<?>> {
	
    public boolean serialize(Object o, DestinationType dest);

    public Object deserialize(SourceType source);

}
