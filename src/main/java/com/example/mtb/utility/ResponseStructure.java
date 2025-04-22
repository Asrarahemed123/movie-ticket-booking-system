package com.example.mtb.utility;

import ch.qos.logback.core.joran.action.Action;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter
@Builder
public class ResponseStructure<T> {
    private int statusCode;
    private String message;
    private T data;


}
