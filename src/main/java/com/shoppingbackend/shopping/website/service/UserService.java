package com.shoppingbackend.shopping.website.service;

import com.shoppingbackend.shopping.website.model.ApplicationUser;
import com.shoppingbackend.shopping.website.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
    //this service layer is used to create all curd related operations
public class UserService {
    //we need to tell springboot hey this class is serviceclass

    // Get User who has ordered maximum products

    //when we create object of one class in another class is known as dependency injection.
    @Autowired
    private UserRepository userRepository;
    public void createUser(ApplicationUser applicationUser){
        //this method wants to save the user into the database
        //so this method will call repository layer to save the user.
    userRepository.createUser(applicationUser);
    }
    public ApplicationUser getUserByEmail(String email){
        //service layer will call repository layer to get the user by email
        ApplicationUser user = userRepository.getUserByEmail(email);
        return user;
    }
    public void updateUserByEmail(ApplicationUser applicationUser, String email){
         userRepository.updateUser( applicationUser ,email);
    }
    public void deleteUser(String email){
         userRepository.deleteUser(email);
    }
}
