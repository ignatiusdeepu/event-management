package com.netinsight.scheduall.event.management.service;

import java.util.List;

import com.netinsight.scheduall.event.management.domain.request.EventGroupRequest;
import com.netinsight.scheduall.event.management.domain.response.EventGroup;

public interface EventGroupService {

	List<EventGroup> listAll();
	
    EventGroup add(EventGroupRequest eventGroupRequest);
}
