/*
 * The MIT License
 *
 * Copyright 2013 Maxim Salikhov.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package io.github.ocnscrim.scrimmage.map;

/**
 * A class containing information about a map author, their name and
 * contribution.
 *
 * @author Maxim Salikhov
 */
public class MapAuthor {

	String n;
	String c;
	MapAuthorType t;

	/**
	 * Basic constructor for a map author, includes all available information
	 * about them.
	 *
	 * @param type
	 * @param name
	 * @param contribution
	 */
	public MapAuthor(MapAuthorType type, String name, String contribution) {
		n = name;
		c = contribution;
		t = type;
	}

	/**
	 * Returns the type of author as specified when object is created. Will
	 * never return null;
	 *
	 * @return type of author
	 */
	public MapAuthorType getType() {
		return t;
	}

	/**
	 * Returns the name of the author as specified when object is created. Will
	 * never return null.
	 *
	 * @return name of author
	 */
	public String getName() {
		return n;
	}

	/**
	 * Returns the contribution the author made to the map, specified when
	 * object is created. May sometimes be null depending on XML.
	 *
	 * @return contribution of author
	 */
	public String getContribution() {
		return c;
	}

	/**
	 * Enum containing the types of authors that are available.
	 */
	public enum MapAuthorType {

		AUTHOR, CONTRIBUTOR;
	}

}
