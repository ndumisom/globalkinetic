/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horizontalweb.recource;

import com.horizontalweb.model.User;
import com.horizontalweb.service.SecurityService;
import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Timed;

/**
 *
 * @author Ndumiso
 */
@Path("/security")
public class SecurityResource {
        @Autowired
        SecurityService securityService;

    	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User signInIS(User user) throws Exception {
            return securityService.login(user);		
	}
    
}
