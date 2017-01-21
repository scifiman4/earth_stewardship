/**
 *
 */

package org.ssfs.earth_stewardship.entities;

import java.util.HashMap;
import java.util.Map;

/**
 * @author denabma
 */
public class GroupSchedule {

    /** unique id */
    private int groupScheduleId;

    /** the {@link Group} whose schedule this is */
    private int groupId;
    /** the schedule */
    private Map<ScheduleBlock, Session> schedule;

    private static int nextId = 0;

    private GroupSchedule() {
	groupScheduleId = nextId++;
    }

    public GroupSchedule(int groupId) {
	this();
	this.groupId = groupId;
	schedule = new HashMap<ScheduleBlock, Session>();
    }

    /**
     * copy constructor
     *
     * @param original
     *            the original {@link GroupSchedule}
     */
    public GroupSchedule(GroupSchedule original) {
	this();
	groupId = original.groupId;
	schedule = original.schedule;
    }

}
