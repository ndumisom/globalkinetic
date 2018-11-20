/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horizontalweb.service;

import com.horizontalweb.dao.SecurityDao;
import com.horizontalweb.model.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Josch
 */
public class SecurityServiceImpl implements SecurityService{
    
    @Autowired
    SecurityDao securityDao;

    @Override
    public User login(User user) {
        return securityDao.login(user);
    }
    
}
