package com.sussencoderdx.repository;


import org.glassfish.jersey.media.multipart.MultiPartFeature;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
 
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class ApplicationConfig extends Application {

	 public static void main(String[] args) {
	        SpringApplication.run(ApplicationConfig.class);
	    }
	
    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(MultiPartFeature.class);
        return resources;
    }

    @Override
    public Map<String, Object> getProperties() {
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put("jersey.config.server.provider.packages", "com.sussencoderdx");
        return properties;
    }
    
    
}