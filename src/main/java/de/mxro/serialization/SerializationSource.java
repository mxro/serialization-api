package de.mxro.serialization;

/**
 * 
 * @author Max
 *
 * @param <SourceType> This will allow a quicker lookup of method since generic parameter will be removed during compile time.
 */
public interface SerializationSource<SourceType> {

	public SourceType getSource();
	
}
