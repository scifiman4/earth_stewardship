package org.ssfs.earth_stewardship.scheduling_base;

public class Block {

    // ===== fields =====

    /**
     * This is used to identify this {@code Block} from others.
     */
    protected String identifier;
    /**
     * the start time for this {@code Block}
     */
    protected long startTime;
    /**
     * the end time for this {@code Block}
     */
    protected long endTime;

    private int blockId;

    // ===== static fields =====

    private static int nextBlockId = 0;

    // ===== constructors =====

    public Block(String id) {
	identifier = id;

	long time = System.currentTimeMillis();
	time = time - time % (1000 * 60); // round down to the nearest minute

	startTime = time;
	endTime = time + 1000 * 60 * 60;

	blockId = nextBlockId++;
    }

    public Block(String id, long start) {
	this(id, start, start + 3600000); // add an hour to the end
    }

    public Block(String id, long start, long end) {
	identifier = id;

	startTime = start - start % (1000 * 60);
	endTime = end - end % (1000 * 60);

	blockId = nextBlockId++;
    }

    // ===== accessors =====

    public String getIdentifier() {
	return identifier;
    }

    public long getStartTime() {
	return startTime;
    }

    public long getEndTime() {
	return endTime;
    }

    // ===== modifiers =====

    public void setStartTime(long newTime) {
	startTime = newTime;
    }

    public void setEndTime(long newTime) {
	endTime = newTime;
    }

    // ===== overrides =====

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + blockId;
	result = prime * result
		+ ((identifier == null) ? 0 : identifier.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	Block other = (Block) obj;
	if (blockId != other.blockId) {
	    return false;
	}
	if (identifier == null) {
	    if (other.identifier != null) {
		return false;
	    }
	} else if (!identifier.equals(other.identifier)) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	String ret = (identifier != null ? identifier : "");
	if (identifier != null && startTime != 0) {
	    ret += ": " + startTime + (endTime != 0 ? " - " + endTime : "");
	}
	return ret;
    }

}
