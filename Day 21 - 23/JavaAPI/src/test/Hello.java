package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


@Path("/hello")
public class Hello {
	
	 @GET
	 @Produces(MediaType.TEXT_XML) 
	 public String sayhello() 
	 { 
		 String response = "<?xml version='1.0'?>" +
		 "<hello> Hey Community, This is Arun Chauhan learning REST API in Java </hello>"; 
		 
	 	 return response; 
	 }
	
	/*
	 * @GET
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public String sayHelloJSON() { String
	 * resource = null; return resource; }
	 */
	
	/*
	 * @GET
	 * 
	 * @Produces(MediaType.TEXT_HTML) public String sayHelloHTML() { String resource
	 * = "<h1> Hey Community, This is Arun from HTML </h1>"; return resource; }
	 */
	
}
