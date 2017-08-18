/**
 * 
 */
package org.arun.webservices.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.arun.webservices.messenger.model.Message;
import org.arun.webservices.messenger.model.Profile;

/**
 * @author ArunMannuru
 *
 */
public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profile = new HashMap<>();
	
	public static Map<Long,Message> getMessages(){
		return messages;
	}
	public static Map<Long,Profile> getProfiles(){
		return profile;
	}
}
