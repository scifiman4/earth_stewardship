package org.ssfs.earth_stewardship.scheduling_base;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RequestGroup implements Iterable<Request> {

    // ===== fields =====

    /**
     * group identifier
     */
    private String groupId;
    /**
     * internal group id
     */
    private List<Request> requests;

    // ===== constructor =====

    /**
     * @param id
     *            group identifier.
     */
    public RequestGroup(String id) {
	groupId = id;

	requests = new LinkedList<Request>();
    }

    // ===== accessor methods =====

    public String getGroupId() {
	return groupId;
    }

    // ===== overrides =====

    @Override
    public Iterator<Request> iterator() {
	return requests.iterator();
    }

}
