/**
 *
 */

package org.ssfs.earth_stewardship.entities;

/**
 * {@link Session}s are scheduled here.
 *
 * @author denabma
 */
public class ScheduleBlock {

    private int blockId;
    private String blockName;

    private static int nextId = 0;

    public ScheduleBlock(String name) {
	blockId = nextId++;
	blockName = name;
    }

}
