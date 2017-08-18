package org.arun.webservices.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.arun.webservices.messenger.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages(){
		
		Message m1 = new Message(1L,"HelloWorld","Arun");
		Message m2 = new Message(2L,"Hello Jersey","Arun");
		List<Message> list = new ArrayList<Message>();
		list.add(m1);
		list.add(m2);
		return list;
	}
	
}
