package io.bumo.sdk.core.utils.http.converters;

import java.io.InputStream;

import io.bumo.sdk.core.utils.http.HttpServiceContext;
import io.bumo.sdk.core.utils.http.ResponseConverter;
import io.bumo.sdk.core.utils.http.agent.ServiceRequest;

public class NullResponseConverter implements ResponseConverter{

    public static final ResponseConverter INSTANCE = new NullResponseConverter();

    private NullResponseConverter(){
    }

    @Override
    public Object getResponse(ServiceRequest request, InputStream responseStream, HttpServiceContext serviceContext){
        return null;
    }

}
