package org.arun.webservices.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.arun.webservices.messenger.model.Message;
import org.arun.webservices.messenger.service.MessageService;

// Mapped url path to particular class in order to work that uri
@Path("/messages")
public class MessageResource {

	MessageService messageService = new MessageService();
	
	// Http method mapped to that particular method to perform functionality
	// produces tell type of response would return by api
	@GET
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public List<Message> getMessages(){
		return messageService.getAllMessages();
	}
	
}
