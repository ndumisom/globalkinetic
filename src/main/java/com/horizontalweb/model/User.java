/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.horizontalweb.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Ndumiso
 */
@Entity
@Table(name = "User")
public class User implements Serializable {
@Id
@GenericGenerator(name="kaugen" , strategy="increment")
@GeneratedValue(generator="kaugen")
    @Column(name = "user_id")
    private int userId;
    @Column(name = "name")
    private String name;
    @Column(name = "sure_name")
    private String surename;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "amail_address")
    private String emailAddress;
    @Column(name = "user_name")
    private String username;
    @Column(name = "password")
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

    public int getUserId() {
        return userId;
    }

    public void setUserId(int id) {
        this.userId = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != 0 ? userId : 0);
        return hash;
    }

        public boolean equals(User object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.userId == 0 && other.userId != 0) || (this.userId != 0 && this.userId!=other.userId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.horizontalweb.model.User[ id=" + userId + " ]";
    }
    
}
