package com.shoppingbackend.shopping.website.controller;

import com.shoppingbackend.shopping.website.model.ApplicationUser;
import com.shoppingbackend.shopping.website.service.AllUserDetailService;
import com.shoppingbackend.shopping.website.service.UserService;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserService userService = new UserService();
    private AllUserDetailService allUserDetailService = new AllUserDetailService();

    @PostMapping("/api/register/user")
    public String registerUser(@RequestBody ApplicationUser applicationUser){
        //Logic for saving user information should be written in service layer
    userService.createUser(applicationUser);
    return "User got saved successfully";
    }
    //we want to get all user details by email
    @GetMapping("/api/user")
    public ApplicationUser getUserByEmail(@RequestParam String email){
        //Controller layer will call service layer to get user by email
        ApplicationUser user = userService.getUserByEmail(email);
        return user;
    }
    //you need to write a method to update the user details by email
    @PutMapping("/api/user/update")
    public ApplicationUser updateUserByEmail(@RequestBody ApplicationUser applicationUser ,
                                             @RequestParam String email){
        userService.updateUserByEmail(applicationUser,email);
        return userService.getUserByEmail(email);
    }

    @DeleteMapping("/api/user/delete")
    public String removeUser(@RequestParam String email){
        userService.deleteUser(email);
        return "User got DELETED.";
    }

    @GetMapping("/api/user/all")
    public List<String> getAllUserName(){
       //we need to call alluserservice
        List <String> names = AllUserDetailService.getAllUserName();
        return names;
    }
}
