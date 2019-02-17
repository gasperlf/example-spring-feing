package com.example.sayhello.proxy;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class RequestFeignInterceptor implements RequestInterceptor {

    /**
     * If you need to put extra information on header, Authorization token or something similar.
     * @param requestTemplate Template tht made a request.
     */
    @Override
    public void apply(RequestTemplate requestTemplate) {
    }
}
