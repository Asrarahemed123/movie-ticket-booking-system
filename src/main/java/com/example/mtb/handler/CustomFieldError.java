package com.example.mtb.handler;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Builder
@Data
public class CustomFieldError {
    String fieldName;
    String message;
    Object rejectValue;
}
