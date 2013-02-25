/*
 * Copyright (C) 2013 Cefalo AS., All Rights Reserved.
 */
package com.cefalo.infomaker;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * <p>
 * This is a controller class
 * </p>
 * @author <a href="mailto:humayun@cefalo.no">Humayun Kabir</a>
 * @version 1.0
 */

@Path("/")
public class Hello {
    /**
     * <p>
     * This method is called when plain text apply.
     * </p>
     * @return body of the page
     */
    @GET
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    public String getPlainTextMessage() {
        return "Hello Rest!!";
    }

    /**
     * <p>
     * This method is called when HTML apply.
     * </p>
     * @return body of the page
     */
    @GET
    @Path("/")
    @Produces(MediaType.TEXT_HTML)
    public String getHtmlTextMessage() {
        return "<h1>Hello Rest!!</h1>";
    }
}
