package com.netinsight.scheduall.event.management.dao.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.netinsight.scheduall.event.management.config.EventGroupConfig;
import com.netinsight.scheduall.event.management.dao.EventGroupRepository;
import com.netinsight.scheduall.event.management.domain.response.EventGroup;

@Repository("helloWorldRepository")
public class EventGroupRepositoryImpl implements EventGroupRepository {

	private static final Logger logger = LoggerFactory.getLogger(EventGroupRepositoryImpl.class);

	@Autowired
	EventGroupConfig eventGroupConfig;
	
	public List<EventGroup> findAll() {
		logger.info("Inside EventGroupRepositoryImpl::findAll");
		return eventGroupConfig.getEventGroupList();
	}
}
