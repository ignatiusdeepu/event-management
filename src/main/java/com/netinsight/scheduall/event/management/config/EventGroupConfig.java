/**
 * 
 */
package com.netinsight.scheduall.event.management.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import com.netinsight.scheduall.event.management.domain.response.EventGroup;

/**
 * @author ignatiusjoseph
 *
 */
@ConfigurationProperties(prefix = "event-group")
@EnableConfigurationProperties
@Component("EventGroupConfig")
public class EventGroupConfig {

	private List<EventGroup> eventGroupList = new ArrayList<>();

	public List<EventGroup> getEventGroupList() {
		return eventGroupList;
	}

	public void setEventGroupList(List<EventGroup> eventGroupList) {
		this.eventGroupList = eventGroupList;
	}
	
}
