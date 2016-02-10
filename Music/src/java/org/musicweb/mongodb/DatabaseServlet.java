/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.musicweb.mongodb;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aznable
 */
@WebServlet(urlPatterns = "/database")
public class DatabaseServlet extends HttpServlet {

    /**
     *used to initialize the database, not sure right to do it or not.
     * @param request
     * @param response
     * @throws java.io.IOException
     */
    @Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException{
            initialDb.initialize();
            /*            PrintWriter out = response.getWriter();//just for test
            out.println("test");*/
        }
}
