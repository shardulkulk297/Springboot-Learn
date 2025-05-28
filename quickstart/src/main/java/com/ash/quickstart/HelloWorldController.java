package com.ash.quickstart;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
//The Get route mapped, annotation is used to map the route to the controller method.
    @GetMapping(path = "/hello")
    public String helloWorld(){
        return "Hello World Pokemon";
    }

//layers
}
