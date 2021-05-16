package sist.com.basic3.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="singleton")
public class MessageData {
	@Value(value="d:\\springDat.doc")
	private String messageFile;
	@Value(value="100")
	private int messageCount;
	@Override
	public String toString() {
		return "MessageData [messageFile=" + messageFile + ", messageCount=" + messageCount + "]";
	}
	
	
	
	

}
