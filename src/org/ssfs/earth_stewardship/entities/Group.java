package org.ssfs.earth_stewardship.entities;

/**
 * A {@link Group} is a group of people to be scheduled. <br/>
 * In this scenario, it's an SSFS Advisory.
 */
public class Group {

    /** this {@link Group}'s Advisor */
    private String groupLeader;
    /** the number of people (advisees) in this {@link Group} */
    private int groupSize;

    /** this advisory's schedule */
    private final GroupSchedule mySchedule;

    // ===== Constructors =====

    public Group() {
	mySchedule = new GroupSchedule();
    }

    /**
     * @param leader
     *            the leader (advisor) of this {@link Group}
     * @param size
     *            the number of people (advisees) in this {@link Group}
     */
    public Group(String leader, int size) {
	this();
	groupLeader = leader;
	groupSize = size;
    }

    // ===== accessor methods =====

    public String getGroupLeader() {
	return groupLeader;
    }

    public int getSize() {
	return groupSize;
    }

    public GroupSchedule getMySchedule() {
	return mySchedule;
    }

    // ===== overrides =====

    @Override
    public String toString() {
	return "Group ["
		+ (groupLeader != null ? "groupLeader=" + groupLeader + ", "
			: "") + "groupSize=" + groupSize + "]";
    }

    // ===== scheduling methods =====

}
