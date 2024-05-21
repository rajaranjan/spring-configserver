package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// Rest Api
@RestController
public class HelloWorldController {

    //hello world

    // @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    @GetMapping ( path = "/hello-world" )
    public String helloWorld() {
        return "hello world";
    }

    @GetMapping( path = "/hello-world-bean" )
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    @GetMapping( path = "/hello-world/path/{name}" )
    public HelloWorldBean helloWorldPath(@PathVariable String name) {
        return new HelloWorldBean("Hello World " + name);
    }
}
