
/**
 * 
 */

package org.ssfs.earth_stewardship.entities;

/**
 * @author denabma
 */
public class Group extends BaseEntity {

	private String groupLeader;
	private final Schedule mySchedule;

	public Group(String leader) {
		super();

		this.groupLeader = leader;
		this.mySchedule = new Schedule();
	}

	public String getGroupLeader() {
		return this.groupLeader;
	}

	public Schedule getMySchedule() {
		return new Schedule(mySchedule);
	}

	@Override
	public String toString() {
		return "Group [groupLeader=" + groupLeader + "]";
	}

}
