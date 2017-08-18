package org.arun.webservices.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import org.arun.webservices.messenger.model.Message;
import org.arun.webservices.messenger.service.MessageService;

@XmlRootElement
// Mapped url path to particular class in order to work that uri
@Path("/messages")
public class MessageResource {

	MessageService messageService = new MessageService();
	
	
	// Http method mapped to that particular method to perform functionality
	// produces tell type of response would return by api
	@GET
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public String helloMessage(){	
		return "Hello Arun";
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message){
		return messageService.addMessage(message);
	}
	
	@PUT
	@Path("/{messageId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("messageId")long id,Message message){
		message.setId(id);
		return messageService.updateMessage(message);
	}
	
	@DELETE
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteMessage(@PathParam("/{messageId}")long id){
		messageService.removeMessage(id);
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages(){
		return messageService.getAllMessages();
	}
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId")long id){
		return messageService.getMessage(id);
	}
}
