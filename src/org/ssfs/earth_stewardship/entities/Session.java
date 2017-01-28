package org.ssfs.earth_stewardship.entities;

import java.util.HashSet;
import java.util.Set;

/**
 * This is a similar to a Section in a course scheduling situation. {link
 * Group}s are scheduled into them.
 */
public class Session {

    // ===== basic info about the Sessions =====

    /** the name of this {@link Session}'s activity */
    private String activityName;
    /** the location this {@link Session} meets in */
    private String location;
    /**
     * the maximum number of people in {@link Group}s that can be scheduled in
     * this {@link Session}.
     */
    private int maxSize;

    // ===== scheduling fields =====

    /** the total number of people in each scheduled {@link Group} */
    private int currentSize;
    /** the {@link Group}s scheduled in this {@link Session} */
    private Set<Group> scheduled;

    // ===== Constructors =====

    public Session() {
	currentSize = 0;
	scheduled = new HashSet<Group>();
    }

    /**
     * @param maxSize
     *            initial maxSize
     * @param activityName
     *            initial activityName for the {@link Session}
     */
    public Session(int maxSize, String activityName) {
	this();
	this.maxSize = maxSize;
	this.activityName = activityName;
    }

    // ===== Accessor methods =====

    public String getActivityName() {
	return activityName;
    }

    public String getLocation() {
	return location;
    }

    public int getMaxSize() {
	return maxSize;
    }

    public int getCurrentSize() {
	return currentSize;
    }

    public Set<Group> getScheduledGroups() {
	return new HashSet<Group>(scheduled);
    }

    // ===== Setter methods =====

    public void setActivityName(String name) {
	activityName = name;
    }

    public void setLocation(String location) {
	this.location = location;
    }

    public void setMaxSize(int size) {
	maxSize = size;
    }

    // ===== Overrides =====

    @Override
    public String toString() {
	String ret = "Session [maxSize="
		+ maxSize
		+ ", currentSize="
		+ currentSize
		+ ", "
		+ (activityName != null ? "activityName=" + activityName + ", "
			: "");
	if (scheduled != null) {
	    ret += "scheduled:" + (scheduled.size() == 0 ? " None" : "");
	    for (Group group : scheduled) {
		ret += "\n" + group;
	    }
	}
	return ret;
    }

    // ===== methods for scheduling =====

    public void unschedule(Group group) {
	if (scheduled.remove(group)) {
	    currentSize -= group.getSize();
	}
    }

    public void schedule(Group group) {
	if (currentSize + group.getSize() <= maxSize && scheduled.add(group)) {
	    currentSize += group.getSize();
	}
    }

    public boolean isScheduled(Group group) {
	return scheduled.contains(group);
    }

}
