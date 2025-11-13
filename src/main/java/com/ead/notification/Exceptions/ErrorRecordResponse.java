package com.ead.notification.Exceptions;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record ErrorRecordResponse(int errorCode, String errorMessage,
                                  Map<String, String> errorDetails) {
}
