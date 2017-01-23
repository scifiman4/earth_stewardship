package org.ssfs.earth_stewardship.entities;

abstract class BaseEntity {

    protected int id;

    private static int nextId = 0;

    protected BaseEntity() {
	id = nextId++;
    }

    public int getId() {
	return id;
    }

}
