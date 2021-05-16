package sist.com.basic4.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Element {	
	@Value("hi")
	private String message;
	@Value("BLUE")
	private String id;
	@Override
	public String toString() {
		return "Element [message=" + message + ", id=" + id + "]";
	}
	
	
	

}
