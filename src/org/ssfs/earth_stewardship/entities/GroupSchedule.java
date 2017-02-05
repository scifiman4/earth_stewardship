/**
 *
 */

package org.ssfs.earth_stewardship.entities;

import java.util.HashMap;
import java.util.Map;

public class GroupSchedule {

    /** the schedule */
    private Map<ScheduleBlock, Session> schedule;

    public GroupSchedule() {
	schedule = new HashMap<ScheduleBlock, Session>();
    }

}
