/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.horizontalweb.service;

import com.horizontalweb.dao.UserDao;
import com.horizontalweb.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Ndumiso
 */
public class UserServiceImpl implements UserService{
    
    @Autowired
    UserDao userDao;

    @Override
    public User AddUser(User user) {
        return userDao.AddUser(user);
    }

    @Override
    public List<User> listAllUsers() {
        return userDao.listAllUsers();
    }

    @Override
    public User updateUser(User user, int userId) {
    return userDao.updateUser(user, userId);
    }

    @Override
    public User deleteUser(int userId) {
        return userDao.deleteUser(userId);
    }

    @Override
    public User getUser(int userId) {
        return userDao.getUser(userId);
    }
}
