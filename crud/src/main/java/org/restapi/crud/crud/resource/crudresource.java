package org.restapi.crud.crud.resource;



import org.restapi.crud.crud.model.crudmodel;
import org.restapi.crud.crud.service.crudservice;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/crud")
public class crudresource {
	crudservice service = new crudservice();
	@Path("/insertion")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public crudmodel addUser(crudmodel user) {
		return service.insertUser(user);
	}
	
	@Path("/retrieve")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<crudmodel>  getUser() throws SQLException {
	
		return service.getUser();
		
	}
	
	@Path("/retrieveById/{id}")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<crudmodel>  getUser(@PathParam("id") int id) throws SQLException {
	
		return service.getUserById(id);
		
	}
	
	
	@Path("/updateUser")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public crudmodel updateUser(crudmodel user) {
	
		return service.updateUser(user);
		
	}
	
	@Path("/deleteUserById/{id}")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public int deleteUser(@PathParam("id") int id) {
	
		return service.deleteUser(id);
		
	}
}
