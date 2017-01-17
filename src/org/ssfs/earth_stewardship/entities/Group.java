
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
	private final Schedule mySchedule;

	private static int nextGroupId = 0;

	public Group(String leader) {
		this.groupId = nextGroupId++;

		this.groupLeader = leader;
		this.mySchedule = new Schedule();
	}

	int getGroupId() {
		return groupId;
	}

	public String getGroupLeader() {
		return this.groupLeader;
	}

	public Schedule getMySchedule() {
		return new Schedule(mySchedule);
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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Group other = (Group) obj;
		if (groupId != other.groupId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Group [groupLeader=" + groupLeader + "]";
	}

}
