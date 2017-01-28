/**
 *
 */

package org.ssfs.earth_stewardship.entities;

/**
 * This is a similar to a Section in a course scheduling situation.
 */
public class Session {

    private int maxSize;
    private String name;

    public Session(int size, String name) {
	maxSize = size;
	this.name = name;
    }

}
