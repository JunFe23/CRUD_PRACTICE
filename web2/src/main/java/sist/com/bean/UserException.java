package sist.com.bean;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR,reason="UserExceptionTestMessage")
//@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="UserExceptionTestMessage")
public class UserException extends RuntimeException{
	private int port;	
	public UserException() {
		//super("UserMessage Test...");
	}	

}
