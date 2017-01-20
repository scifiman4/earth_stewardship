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

    /**
     * copy constructor TODO
     *
     * @param orig
     */
    GroupSchedule(GroupSchedule orig) {
	// TODO create copy constructor
    }

    public GroupSchedule(int groupId) {
	this.groupId = groupId;
	schedule = new HashMap<ScheduleBlock, Session>();
    }

}
