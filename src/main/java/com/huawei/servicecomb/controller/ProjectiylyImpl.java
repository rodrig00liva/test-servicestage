package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-12-09T20:40:37.600Z")

@RestSchema(schemaId = "projectiyly")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class ProjectiylyImpl {

    @Autowired
    private ProjectiylyDelegate userProjectiylyDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectiylyDelegate.helloworld(name);
    }

}
