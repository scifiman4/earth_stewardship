package org.ssfs.earth_stewardship.scheduling_base;

import java.util.HashMap;
import java.util.Map;

/**
 * This is the schedule for an {@link AbstractSchedulable}.
 */
public class Schedule {

    // ===== fields =====

    /**
     * Maps a {@link Block} to an {@link Activity}.
     */
    protected Map<Block, Activity> schedule;

    // ===== constructor =====

    public Schedule() {
	schedule = new HashMap<Block, Activity>();
    }

    // ===== scheduling methods =====

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
	// TODO check if the block is filled already
	// TODO check if the åctivity's category is used
	schedule.put(block, activity);
    }

    // ===== overriding methods =====

    @Override
    public String toString() {
	String ret = "";
	for (Block b : schedule.keySet()) {
	    ret += b + ": " + schedule.get(b) + "\n";
	}
	return ret;
    }

}
