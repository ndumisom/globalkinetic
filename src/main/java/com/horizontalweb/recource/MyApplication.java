package com.horizontalweb.recource;

import org.glassfish.jersey.server.ResourceConfig;

public class MyApplication extends ResourceConfig{
	
	public MyApplication() {
        register(UserResource.class);
        register(SecurityResource.class);
	}

}
