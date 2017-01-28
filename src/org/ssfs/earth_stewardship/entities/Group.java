/**
 *
 */

package org.ssfs.earth_stewardship.entities;

public class Group {

    private int groupId;
    private String groupLeader;
    private int groupSize;
    private final GroupSchedule mySchedule;

    private static int nextGroupId = 0;

    public Group(String leader, int size) {
	groupId = nextGroupId++;

	groupLeader = leader;
	groupSize = size;
	mySchedule = new GroupSchedule(groupId);
    }

    public String getGroupLeader() {
	return groupLeader;
    }

    public int getSize() {
	return groupSize;
    }

    public GroupSchedule getMySchedule() {
	return new GroupSchedule(mySchedule);
    }

    @Override
    public String toString() {
	return "Group ["
		+ (groupLeader != null ? "groupLeader=" + groupLeader + ", "
			: "") + "groupSize=" + groupSize + "]";
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + groupId;
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	Group other = (Group) obj;
	if (groupId != other.groupId) {
	    return false;
	}
	return true;
    }

}
