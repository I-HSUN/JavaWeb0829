package com.web.study.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

@Path("count")
public class CountSingleService {
    private  int count;
    
    @Path("add")
    @GET
    @Produces("text/plain")
    public String add(@Context MyApplication app){
     int max = Integer.parseInt(app.getProperties().get("max").toString());
     int min = Integer.parseInt(app.getProperties().get("min").toString());
    count = (count>=max)?min:count;
     count++;
    return "count:"+count;
    }
}
