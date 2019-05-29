package com.netinsight.scheduall.event.management.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netinsight.scheduall.event.management.dao.EventGroupRepository;
import com.netinsight.scheduall.event.management.domain.request.EventGroupRequest;
import com.netinsight.scheduall.event.management.domain.response.EventGroup;
import com.netinsight.scheduall.event.management.service.EventGroupService;

@Service("eventGroupService")
public class EventGroupServiceImpl implements EventGroupService{

	private static final Logger logger = LoggerFactory.getLogger(EventGroupServiceImpl.class);
	
	@Autowired
	EventGroupRepository eventGroupRepository;
	
	@Override
	public List<EventGroup> listAll() {
		logger.info("Begin EventGroupServiceImpl::listAll");
		List<EventGroup> eventGroupList = eventGroupRepository.findAll();
		List<EventGroup> sortedList = eventGroupList.stream().sorted((a,b)->{
                return a.getStartDate().compareTo(b.getStartDate());
        }).collect(Collectors.toList());
		logger.info("Begin EventGroupServiceImpl::listAll");
		return sortedList;
	}
	
	@Override
	public EventGroup add(EventGroupRequest eventGroupRequest) {
		logger.info("Begin EventGroupServiceImpl::add");
		EventGroup eventGroup = eventGroupRepository.add(eventGroupRequest);
		logger.info("Begin EventGroupServiceImpl::add");
		return eventGroup;
	}
}
