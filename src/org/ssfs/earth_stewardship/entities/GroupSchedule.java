/**
 *
 */

package org.ssfs.earth_stewardship.entities;

import java.util.HashMap;
import java.util.Map;

public class GroupSchedule {

    /** the {@link Group} whose schedule this is */
    private int groupId;
    /** the schedule */
    private Map<ScheduleBlock, Session> schedule;

    public GroupSchedule(int groupId) {
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
	groupId = original.groupId;
	schedule = original.schedule;
    }

    @Override
    public String toString() {
	return "GroupSchedule ["
		+ (schedule != null ? "schedule=" + schedule : "") + "]";
    }

}
