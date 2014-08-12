package de.mxro.serialization;

import de.mxro.serialization.string.StringDestination;
import de.mxro.serialization.string.StringSource;

public class Serialization {

	public static StringDestination createStringDestination() {
		return new StringDestination();
	}

	public static StringSource createStringSource(String s) {
		return new StringSource(s);
	}

}
