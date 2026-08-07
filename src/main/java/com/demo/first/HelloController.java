package com.demo.first;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController // used to create a REST API
@RequestMapping("/api") // this is basically used at class level
// it depicts for all api endpoints that these are api endpoints

// for example in Order controller we could use /order and then all order endpoints
// for depicting every endpoint in order controller.
public class HelloController {

    @GetMapping("/hello") // get request
    public String sayHello()
    {
        return "Hello World";
    }


   // @GetMapping("/user") // creating user endpoint
    @RequestMapping(value = "/user", method = RequestMethod.GET) // this is basically
    //used for multiple requests like post, put, update.
    public User getUser()
    {
        return new User(1, "Saksham", "saksham@abc.com");
    }
}
