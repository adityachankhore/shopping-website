package com.shoppingbackend.shopping.website.controller;

import com.shoppingbackend.shopping.website.model.ApplicationUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@RestController
//@RestController -> We are telling Springboot this particular class is the
//Controller class
public class Controller {
    //We need to define some kind of url such that client is going to communicate
    //with our server

 // http://localhost:8081/hello
 @GetMapping("/hello")
    public String sayHii(){
     return "Hello World, I am Aditya";
 }

  // Javascript Object Notation - json
    // Post Method : client send some kind of data to Server
    // Data is called as request body
    // Generally we send request body in json format
    // and that json format will get converted in the java object

  @PostMapping("/api/register")
    //Request : data send by client to save information in the server
    public void createAccount(@RequestBody ApplicationUser applicationUser){

     System.out.println(applicationUser.getName());
     System.out.println(applicationUser.getPassword());
     System.out.println(applicationUser.getEmail());
     System.out.println(applicationUser.getPassword());
  }
}
