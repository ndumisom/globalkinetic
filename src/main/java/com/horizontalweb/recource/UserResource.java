/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.horizontalweb.recource;

import com.horizontalweb.model.User;
import com.horizontalweb.service.UserService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Ndumiso
 */

@Path("users")
public class UserResource {
@Autowired
UserService userService;

@POST
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public User addUser(User user){
    return userService.AddUser(user);
}
@GET
@Produces(MediaType.APPLICATION_JSON)
 public List<User> getAllUsers(){
  return userService.listAllUsers();
 }
 
 @GET
 @Path("/{id}")
 @Produces(MediaType.APPLICATION_JSON)
 public User getUSer(@PathParam("id") int userId){
     return userService.getUser(userId);
 }
 
 @PUT
 @Consumes(MediaType.APPLICATION_JSON)
 @Produces(MediaType.APPLICATION_JSON)
 @Path("/{id}")
 public User updateUser(User user,@PathParam("id") int userId){
     return userService.updateUser(user, userId);
}
 
 @Path("/{id}")
 @DELETE
 @Produces(MediaType.APPLICATION_JSON)
 
 public User deleteUser(@PathParam("id") int userId){
 
     return userService.deleteUser(userId);
 }
    
}
