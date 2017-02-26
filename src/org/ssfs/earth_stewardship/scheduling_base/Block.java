package org.ssfs.earth_stewardship.scheduling_base;

public class Block {

    // ===== fields =====

    protected String identifier;
    private int blockId;

    // ===== static fields =====

    private static int nextBlockId = 0;

    // ===== constructors =====

    public Block(String id) {
	identifier = id;
	blockId = nextBlockId++;
    }

    // ===== accessors =====

    public String getIdentifier() {
	return identifier;
    }

    // ===== overrides=====

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
	return "Block [blockId=" + blockId + ", "
		+ (identifier != null ? "identifier=" + identifier : "") + "]";
    }

}
