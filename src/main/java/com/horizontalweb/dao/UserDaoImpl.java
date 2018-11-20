/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.horizontalweb.dao;

import com.horizontalweb.model.User;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Ndumiso
 */
public class UserDaoImpl implements UserDao{
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public User AddUser(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        try{
         session.save(user);
         transaction.commit();
         session.close();
         return user;
        } catch(Exception exception){
        transaction.rollback();
        session.close();
        return null;
        }
    }

    @Override
    public List<User> listAllUsers() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try{
         List<User> users = session.createQuery("from User").list();
         transaction.commit();
         session.close();
         return users;
        }
        catch(Exception exception){
            transaction.rollback();
            session.close();
            return null;
        }
    }

    @Override
    public User updateUser(User theuser, int userId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try{
            User user = theuser;
          user.setUserId(userId);
         session.saveOrUpdate(user);
         transaction.commit();
         session.close();
         return user;
        }
        catch(Exception exception){
            transaction.rollback();
            session.close();
            return null;
        
        }
    }

    @Override
    public User deleteUser(int userId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try{
        User user = session.get(User.class, userId);
        session.delete(user);
        transaction.commit();
        session.close();
        return  user;
        }
        catch(Exception exception){
            transaction.rollback();
            session.close();
            return null;            
        }
    }

    @Override
    public User getUser(int userId) {
         Session session = sessionFactory.openSession();
         Transaction transaction = session.beginTransaction();
         try{
         User user = session.get(User.class, userId);
         transaction.commit();
         session.close();
         return user;
         }
         catch(Exception exception){
         transaction.rollback();
         session.close();
         return null;
         }
        }
}
