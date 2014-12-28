package com.gaoshin.buddy.rest;

import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

public class FreeCycleJerseyApplication extends ResourceConfig {

	public FreeCycleJerseyApplication() {
        register(RequestContextFilter.class);
		packages("com.gaoshin.buddy.rest");
		
        register(MessageBodyReader.class);
        register(MessageBodyWriter.class);
        register(MultiPartFeature.class);
	}
}
