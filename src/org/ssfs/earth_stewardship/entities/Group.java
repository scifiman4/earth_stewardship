/**
 *
 */

package org.ssfs.earth_stewardship.entities;

/**
 * @author denabma
 */
public class Group {

    private int groupId;
    private String groupLeader;
    private final GroupSchedule mySchedule;

    private static int nextGroupId = 0;

    public Group(String leader) {
	groupId = nextGroupId++;

	groupLeader = leader;
	mySchedule = new GroupSchedule();
    }

    public String getGroupLeader() {
	return groupLeader;
    }

    public GroupSchedule getMySchedule() {
	return new GroupSchedule(mySchedule);
    }

    @Override
    public String toString() {
	return "Group [groupLeader=" + groupLeader + "]";
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + groupId;
	result = prime * result
		+ ((groupLeader == null) ? 0 : groupLeader.hashCode());
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
	if (groupLeader == null) {
	    if (other.groupLeader != null) {
		return false;
	    }
	} else if (!groupLeader.equals(other.groupLeader)) {
	    return false;
	}
	return true;
    }

}
