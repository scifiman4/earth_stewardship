package org.ssfs.earth_stewardship.scheduling_base;

import java.util.ArrayList;
import java.util.List;

/**
 * A {@code AbstractSchedulable} is an item that can be scheduled.<br>
 * <br>
 * Examples:
 * <ul>
 * <li>Earth Stewardship Day (ESD) Group</li>
 * <li>Student</li>
 * <li>Dorm student</li>
 * </ul>
 */
public abstract class AbstractSchedulable {

    // ===== fields =====

    /**
     * the amount of space this object uses up in an {@link Activity}.
     */
    protected int size;
    /**
     * the schedule for this {@code AbstractSchedulable}.
     */
    protected List<Activity> mySchedule;
    /**
     * This is used to identify this {@code AbstractSchedulable} from others.
     */
    protected String identifier;

    public AbstractSchedulable() {
	mySchedule = new ArrayList<Activity>();
    }

    // ===== accessor methods =====

    /**
     * how much space this {@code AbstractSchedulable} takes up in an
     * {@link Activity}.<br>
     * <br>
     * Examples:
     * <ul>
     * <li>In an ESD Group, this is the number of people in the group.</li>
     * <li>For Students, the size is 1.</li>
     * </ul>
     *
     * @return the size of this item
     */
    public int getSize() {
	return size;
    }

    public String getIdentifier() {
	return identifier;
    }

    /**
     * retrieves the associated {@link Schedule} for this
     * {@code AbstractSchedulable}
     *
     * @return the {@link Schedule} associated with the object.
     */
    public List<Activity> getSchedule() {
	return mySchedule;
    }

    // ===== overriding methods =====

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result
		+ ((identifier == null) ? 0 : identifier.hashCode());
	return result;
    }

    @Override
    public abstract String toString();

    @Override
    public abstract boolean equals(Object obj);

}
