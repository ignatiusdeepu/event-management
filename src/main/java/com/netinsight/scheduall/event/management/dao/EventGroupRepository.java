package com.netinsight.scheduall.event.management.dao;

import java.util.List;

import com.netinsight.scheduall.event.management.domain.response.EventGroup;

public interface EventGroupRepository{

	List<EventGroup> findAll();
}
