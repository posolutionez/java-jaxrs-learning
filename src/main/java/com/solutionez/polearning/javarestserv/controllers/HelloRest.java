package com.solutionez.polearning.javarestserv.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.Date;

/**
 * Created by poneal on 11/3/2016.
 */

@Path("/hello")
public class HelloRest {

    @GET
    @Produces("text/html")
    public Response getStartingPage()
    {
        String output = "<h1>Hello World!<h1>" +
                "<p>RESTful Service is running ... <br>Ping @ " + new Date().toString() + "</p<br>";
        return Response.status(200).entity(output).build();
    }
}
