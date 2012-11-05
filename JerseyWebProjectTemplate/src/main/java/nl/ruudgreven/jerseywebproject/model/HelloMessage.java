package nl.ruudgreven.jerseywebproject.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * This class represents a hello world message
 * @author ruud
 *
 */
@XmlRootElement
public class HelloMessage {
	private String username;
	
	public String getMessage() {
		return "Hello " + username;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
}
