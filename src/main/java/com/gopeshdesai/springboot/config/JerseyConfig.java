package com.gopeshdesai.springboot.config;

import com.gopeshdesai.springboot.controller.GreetingController;
import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.wadl.internal.WadlResource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by gopeshdesai on 10/9/16.
 */
@Component
public class JerseyConfig extends ResourceConfig{
    @Value("${spring.jersey.application-path:/}")
    private String apiPath;

    @PostConstruct
    private void init() {
        this.register(GreetingController.class);
        this.register(WadlResource.class);
        this.register(ApiListingResource.class);
        this.register(SwaggerSerializers.class);

        this.configureSwagger();
    }

    private void configureSwagger() {
        BeanConfig config = new BeanConfig();

        config.setConfigId("springboot-jersey-swagger-docker-example");
        config.setTitle("Spring Boot + Jersey + Swagger + Docker Example");
        config.setVersion("v1");
        config.setContact("Gopesh Desai");
        config.setSchemes(new String[] { "http", "https" });
        config.setBasePath(this.apiPath);
        config.setResourcePackage("com.gopeshdesai.springboot.controller");
        config.setPrettyPrint(true);
        config.setScan(true);
    }
}
