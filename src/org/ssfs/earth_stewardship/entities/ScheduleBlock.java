package org.ssfs.earth_stewardship.entities;

/**
 * {@link Session}s are scheduled here.
 */
public class ScheduleBlock {

    /** the name of this block */
    private String blockName;
    /** the order for which to display this {@link ScheduleBlock} in */
    private int blockNumber;

    private static int maxBlockNumber = 0;

    public ScheduleBlock(String name) {
	blockName = name;
	blockNumber = maxBlockNumber++;
    }

}
