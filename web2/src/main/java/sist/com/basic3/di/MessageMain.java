package sist.com.basic3.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MessageMain {
	
	public static void main(String[] args) {
		 ApplicationContext context=new FileSystemXmlApplicationContext("src/main/java/sist/com/basic3/di/message.xml");
		 System.out.println(context.getBean("orange") );
	}

}
