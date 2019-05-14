package com.automation.framework.apiautomation.http;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public enum HttpMethodType {
    HEAD(1, "HEAD"),
    GET(2, "GET"),
    PUT(3, "PUT"),
    POST(4, "POST"),
    DELETE(5, "DELETE"),
    PATCH(6, "PATCH"),
    OPTIONS(7, "OPTIONS");

    private int code;
    private String name;

}
