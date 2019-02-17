package com.example.sayhello.proxy;

import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AppErrorDecoder implements ErrorDecoder {

    /**
     * Override method, execute when there are errors with.
     * @param s feign.Feign.configKey of the java method that invoked the request.ex. IAM#getUser()
     * @param response HTTP response where status is greater than or equalto 300.
     * @return Exception.
     */
    @Override
    public Exception decode(String s, Response response) {

        log.error("Http Request: {}", response.request());
        log.error("Http Response: {}", response);
        return null;
    }
}
