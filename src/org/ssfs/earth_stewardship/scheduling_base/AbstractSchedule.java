package org.ssfs.earth_stewardship.scheduling_base;

import java.util.HashMap;
import java.util.Map;

/**
 * This is the schedule for an {@link AbstractSchedulable}.
 */
public class AbstractSchedule {

    /**
     * Maps a {@link Block} to an {@link Activity}.
     */
    protected Map<Block, Activity> schedule;

    public AbstractSchedule() {
	schedule = new HashMap<Block, Activity>();
    }

    public boolean isBlockScheduled(Block block) {
	return schedule.containsKey(block) && schedule.get(block) != null;
    }

    public Activity getActivityInBlock(Block block) {
	return isBlockScheduled(block) ? schedule.get(block) : null;
    }

    public void scheduleActivityIntoBlock(Block block, Activity activity) {
	if (block == null || activity == null) {
	    throw new NullPointerException();
	}
	schedule.put(block, activity);
    }

}
