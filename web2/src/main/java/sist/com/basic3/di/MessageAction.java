package sist.com.basic3.di;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Value;

@Component(value="action")
/*@Scope(value="prototype")*/
@Scope(value="prototype")
public class MessageAction {
	private MessageData messageData;
	
	public MessageAction() {
		System.out.println("MessageAction Constr");
	}
	public MessageData getMessageData() {
		return messageData;
	}
	@Required
	/*@Resource(name="messageData")*/
	@Inject
	public void setMessageData(MessageData messageData) {
		this.messageData = messageData;
	}
	@PostConstruct
	public void initData() {	
		System.out.println("initData");
	}
	@PreDestroy
	public void destoryData() {
		System.out.println("destoryData");
	}
	@Override
	public String toString() {
		return "MessageAction [messageData=" + messageData + "]";
	}
	
	
	
	

}
