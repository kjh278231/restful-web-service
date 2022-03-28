package com.springtutorial.restfulwebservice;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    // GET 방식
    // /hello-world (endpoint)
//    @RequestMapping(method = RequestMethod.GET,path = "hello-world")
    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path = "/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s",name));
    }
}
