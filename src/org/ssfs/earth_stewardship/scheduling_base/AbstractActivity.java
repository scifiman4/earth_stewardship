package org.ssfs.earth_stewardship.scheduling_base;

import java.util.LinkedList;
import java.util.List;

/**
 * An {@code AbstractActivity} is an activity that an
 * {@link AbstractSchedulable} can do.<br>
 * <br>
 * Examples:
 * <ul>
 * <li>Class Section</li>
 * <li>Dining Table</li>
 * <li>Earth Stewardship Day Session</li>
 * </ul>
 */
public class AbstractActivity {

    // ===== fields =====

    /**
     * a summary of this topic (table leader, ESD Session name, etc.
     */
    protected String identifier;
    /**
     * a way to group {@code AbstractActivity}s.
     */
    protected String category;
    /**
     * the total combined size of all of the {@link AbstractSchedulable}s.
     */
    protected int capacity;
    /**
     * the location of this {@code AbstractActivity}
     */
    protected String location;
    /**
     * the aggregate sum of {@link AbstractSchedulable#getSize()}.
     */
    protected int currentSize;

    /**
     * the {@link AbstractSchedulable}s doing this activity.
     */
    protected List<AbstractSchedulable> scheduled; // TODO do i need this??

    // ===== accessor methods =====

    public AbstractActivity() {
	scheduled = new LinkedList<AbstractSchedulable>();
    }

    /**
     * @return the identifier
     */
    public String getIdentifier() {
	return identifier;
    }

    /**
     * @return the category
     */
    public String getCategory() {
	return category;
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
	return capacity;
    }

    /**
     * @return the location
     */
    public String getLocation() {
	return location;
    }

    /**
     * @return the current size of this {@code AbstractActivity}
     */
    public int getCurrentSize() {
	return currentSize;
    }

    // ===== modifier methods =====

    /**
     * @param identifier
     *            the identifier to set
     */
    public void setIdentifier(String identifier) {
	this.identifier = identifier;
    }

    /**
     * @param category
     *            the category to set
     */
    public void setCategory(String category) {
	this.category = category;
    }

    /**
     * @param location
     *            the location to set
     */
    public void setLocation(String location) {
	this.location = location;
    }

    // ===== scheduling functions =====

    /**
     * check if this activity has space to hold the specified item
     *
     * @param item
     *            the item to check if there is space for
     * @return true if this Activity has space for the specifie item
     */
    public boolean hasSpaceFor(AbstractSchedulable item) {
	return currentSize + item.getSize() <= capacity;
    }

    /**
     * check if the item is scheduled in this Activity
     *
     * @param item
     *            the item to check for
     * @return true if this item is scheduled in this Activity.
     */
    public boolean isScheduled(AbstractSchedulable item) {
	return scheduled.contains(item);
    }

    /**
     * schedule the item
     *
     * @param item
     *            the item to schedule
     * @return true if the item was successfully scheduled.
     */
    public boolean schedule(AbstractSchedulable item) {
	if (scheduled.contains(item)) {
	    return false;
	}
	if (item.getSize() + currentSize > capacity) {
	    return false;
	}
	return scheduled.add(item);
    }

    // ===== overriding methods =====

    @Override
    public String toString() {
	return "AbstractActivity ["
		+ (category != null ? "category=" + category + ", " : "")
		+ (identifier != null ? "identifier=" + identifier + ", " : "")
		+ "currentSize=" + currentSize + ", capacity=" + capacity
		+ ", " + (location != null ? "location=" + location : "") + "]";
    }

}
