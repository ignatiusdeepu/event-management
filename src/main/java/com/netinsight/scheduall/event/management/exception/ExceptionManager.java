package com.netinsight.scheduall.event.management.exception;

import java.util.List;

import org.springframework.web.bind.MethodArgumentNotValidException;

import com.netinsight.scheduall.event.management.domain.response.BasicErrorResponse;
import com.netinsight.scheduall.event.management.domain.response.StandardResponse;


public interface ExceptionManager
{
	public static final String DEFAULT_ERROR_CODE = "DEFAULT";

	public String getDefaultErrorCode();
	
	public StandardResponse<List<BasicErrorResponse>> logAndProduceError(ApplicationException ex);

	public StandardResponse<List<BasicErrorResponse>> logAndProduceError(Throwable t);

	public StandardResponse<List<BasicErrorResponse>> logAndProduceError(MethodArgumentNotValidException badRequestData);

	public StandardResponse<List<BasicErrorResponse>> logAndProduceError(String errorCode, String userMessage, Throwable t);
	
}
