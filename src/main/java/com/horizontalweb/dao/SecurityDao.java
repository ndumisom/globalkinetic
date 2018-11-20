/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horizontalweb.dao;

import com.horizontalweb.model.User;

/**
 *
 * @author Josch
 */
public interface SecurityDao {
    
    	public User login(User user);
    
}
