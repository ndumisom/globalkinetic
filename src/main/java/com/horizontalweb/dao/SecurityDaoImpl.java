/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horizontalweb.dao;

import com.horizontalweb.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Josch
 */
public class SecurityDaoImpl implements SecurityDao{
    
    @Autowired
    SessionFactory sessionFactory;

   
    public User login(User user) {
        Session session = null;
        Transaction transaction = null;
        List<User> listOfItems = new ArrayList<User>();
        try{
             session = sessionFactory.openSession();
             transaction = session.beginTransaction();
             Query query = session.createQuery("FROM User WHERE user_Id = :userId and password = :password ");
             query.setParameter("userId", user.getUserId());
             query.setParameter("password", user.getPassword());
             listOfItems = query.list();
             if(listOfItems.size()>0){
              User user1 = session.get(User.class, user.getUserId());
              return user1;          
             } else{
             return null;
             }
        }catch(Exception exception){
        transaction.rollback();
        session.close();
        return null;
        }
  }
}
