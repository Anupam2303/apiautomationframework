package com.automation.framework.apiautomation.http;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;


public class HttpClient {
    protected static final Logger LOGGER = Logger.getLogger(HttpClient.class);

    public static Response send(RequestSpecification request, String methodPath, HttpMethodType methodType) {
        Response response = null;
//        SystemProxy.setupProxy();
        switch (methodType) {
            case HEAD:
                response = request.head(methodPath);
                break;
            case GET:
                response = request.get(methodPath);
                break;
            case PUT:
                response = request.put(methodPath);
                break;
            case POST:
                response = request.post(methodPath);
                break;
            case DELETE:
                response = request.delete(methodPath);
                break;
            case PATCH:
                response = request.patch(methodPath);
                break;
            case OPTIONS:
                response = request.options(methodPath);
                break;
            default:
                throw new RuntimeException("MethodType is not specified for the API method: " + methodPath);
        }

        return response;
    }

}
