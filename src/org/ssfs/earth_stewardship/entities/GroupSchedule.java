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

    private int groupId;

    private Map<ScheduleBlock, Session> schedule;

    public GroupSchedule(int groupId) {
	this.groupId = groupId;
	schedule = new HashMap<ScheduleBlock, Session>();
    }

    /**
     * copy constructor TODO
     *
     * @param original
     */
    public GroupSchedule(GroupSchedule original) {
	groupId = original.groupId;
	schedule = original.schedule;
    }

}
