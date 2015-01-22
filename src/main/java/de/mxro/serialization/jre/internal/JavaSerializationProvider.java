/*******************************************************************************
 * Copyright 2011 Max Erik Rohde http://www.mxro.de
 * 
 * All rights reserved.
 ******************************************************************************/
package de.mxro.serialization.jre.internal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import de.mxro.serialization.Serializer;
import de.mxro.serialization.jre.StreamDestination;
import de.mxro.serialization.jre.StreamSource;

public class JavaSerializationProvider implements Serializer<StreamSource, StreamDestination> {

    @Override
    public Object deserialize(final StreamSource source) {
        try {
            final Object res = new ObjectInputStream(source.getSource()).readObject();

            return res;
        } catch (final IOException e) {
            throw new RuntimeException(e);
        } catch (final ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean serialize(final Object o, final StreamDestination dest) {
        assert o != null : "Cannot serialize object <null>.";

        try {
            new ObjectOutputStream(dest.getDestination()).writeObject(o);
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }

        return true;
    }

}
