package com.shoppingbackend.shopping.website.repository;

import com.shoppingbackend.shopping.website.model.ApplicationUser;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class UserRepository {
    //Rightnow we are not using any database.
    //UserEmail vs ApplicationUser object
   private HashMap<String, ApplicationUser> userDB = new HashMap<>();

   public void createUser(ApplicationUser applicationUser){
       String userEmail = applicationUser.getEmail();
       userDB.put(userEmail, applicationUser);
   }
   public ApplicationUser getUserByEmail(String email){
       ApplicationUser user = userDB.get(email);
       return user;
   }
   public void updateUser(ApplicationUser user, String email){
       userDB.put(email, user);
   }
}
