package com.cjcode.projectMinTic.Exception;

import lombok.Builder;

@Builder
public class ApiException extends Exception{
    private String message;
}
