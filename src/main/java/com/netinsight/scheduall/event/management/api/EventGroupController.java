package com.netinsight.scheduall.event.management.api;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netinsight.scheduall.event.management.domain.request.EventGroupRequest;
import com.netinsight.scheduall.event.management.domain.response.EventGroup;
import com.netinsight.scheduall.event.management.domain.response.StandardResponse;
import com.netinsight.scheduall.event.management.service.EventGroupService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "/eventgroup")
@RestController
@RequestMapping("/eventgroup")
public class EventGroupController {
	
	private static final Logger logger = LoggerFactory.getLogger(EventGroupController.class);
	
	@Autowired
	EventGroupService eventGroupService;
	
	@ApiOperation(value = "Returns the list of all the Event Groups")
	@GetMapping(path = "/list", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public StandardResponse<List<EventGroup>> listAll() throws Exception {
		logger.info("Begin EventGroupController::listAll");
		final StandardResponse<List<EventGroup>> standardResponse = new StandardResponse<List<EventGroup>>();
		standardResponse.setResponseOK();
		standardResponse.setData(eventGroupService.listAll());
		logger.info("End EventGroupController::listAll");
		return standardResponse;
	}
	
	@ApiOperation(value = "Adds an event group")
	@PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public StandardResponse<EventGroup> add(@RequestBody EventGroupRequest eventGroupRequest) throws Exception {
		logger.info("Begin EventGroupController::add");
		final StandardResponse<EventGroup> standardResponse = new StandardResponse<EventGroup>();
		standardResponse.setResponseOK();
		standardResponse.setData(eventGroupService.add(eventGroupRequest));
		logger.info("End EventGroupController::add");
		return standardResponse;
	}
}
