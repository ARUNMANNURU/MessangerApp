/**
 * 
 */
package org.arun.webservices.messenger.database;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import org.arun.webservices.messenger.model.Message;

/**
 * @author ArunMannuru
 *
 */
@XmlRootElement
public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
	
	public static Map<Long,Message> getMessages(){
		return messages;
	}
	
}
