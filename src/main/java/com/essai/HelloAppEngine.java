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
    name = "HelloAppEngine",
    urlPatterns = {"/hello"}
)
public class HelloAppEngine extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
	  
	  String name = request.getParameter("name");
	  
	  System.out.println("name=" + name);
	  
	  DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
	  
	  Entity person = new Entity("Person");
	  person.setProperty("name", name);
	  person.setProperty("age", 10);
	  
	  ds.put(person);
	      
	  response.sendRedirect("response.html");

  }
}