package org.ssfs.earth_stewardship.entities;

abstract class BaseEntity {

    protected int id;

    private static int nextId = 0;

    public BaseEntity() {
	id = nextId++;
    }

    public int getId() {
	return id;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
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
	BaseEntity other = (BaseEntity) obj;
	if (id != other.id) {
	    return false;
	}
	return true;
    }

}
