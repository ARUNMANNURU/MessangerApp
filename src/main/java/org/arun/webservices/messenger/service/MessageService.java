package org.arun.webservices.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import org.arun.webservices.messenger.database.DatabaseClass;
import org.arun.webservices.messenger.model.Message;

@XmlRootElement
public class MessageService {
	
	private Map<Long,Message> messages = DatabaseClass.getMessages();
	
	public List<Message> getAllMessages(){
		return new ArrayList<Message>(messages.values()); 
	}
	public Message getMessage(long id){
		return messages.get(id);
	}
	public MessageService(){
		messages.put(1L, new Message(1,"Hello","Arun"));
		messages.put(2L, new Message(2,"HelloJersey","ArunMannuru"));		
	}
	
	public Message addMessage(Message message){
	
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	
	}
	public Message updateMessage(Message message){
		if(message.getId() <= 0){
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	public Message removeMessage(long id){
		return messages.remove(id);
	}
}
