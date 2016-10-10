package com.gopeshdesai.springboot.controller;

/**
 * Created by gopeshdesai on 10/8/16.
 */

import io.swagger.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Api(value= "Greeting resource", produces = "application/json")
@Component
@Path("/greeting")
public class GreetingController
{
    @ApiOperation(value="Get a hello resource")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Greeting completed successfully"),
            @ApiResponse(code = 404, message = "Admin control not found")
    })
    @GET
    @Produces("application/json")
    @Path("{name}")
    public Greeting getMessage(@ApiParam @PathParam("name") String content) {
        return new Greeting(content);
    }
}
