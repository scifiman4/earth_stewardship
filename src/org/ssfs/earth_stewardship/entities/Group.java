
/**
 * 
 */

package org.ssfs.earth_stewardship.entities;

/**
 * @author denabma
 */
public class Group extends BaseEntity {

	private String groupLeader;
	private final GroupSchedule mySchedule;

	public Group(String leader) {
		super();

		this.groupLeader = leader;
		this.mySchedule = new GroupSchedule();
	}

	public String getGroupLeader() {
		return this.groupLeader;
	}

	public GroupSchedule getMySchedule() {
		return new GroupSchedule(mySchedule);
	}

	@Override
	public String toString() {
		return "Group [groupLeader=" + groupLeader + "]";
	}

}
