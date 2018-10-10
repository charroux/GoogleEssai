package com.essai;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

@WebServlet(
    name = "BackEndTask",
    urlPatterns = {"/task"}
)
public class BackEndTask extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
	  
	  String name = request.getParameter("name");
	  System.out.println("Back end task receives: " + name);
	  
	  //response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
	 
  }
}