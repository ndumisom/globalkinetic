/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.horizontalweb.service;

import com.horizontalweb.model.User;
import java.util.List;

/**
 *
 * @author Ndumiso
 */
public interface UserService {
    public User AddUser(User user);
    public List<User> listAllUsers();
    public User updateUser(User user,int userId);
    public User deleteUser(int userId);
    public User getUser(int userId);
    
    
}
