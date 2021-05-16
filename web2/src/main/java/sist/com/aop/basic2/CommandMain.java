package sist.com.aop.basic2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CommandMain {
	
	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("src/main/java/sist/com/aop/basic2/command.xml");
		Unit marine=(Unit)context.getBean("marinProxy");		
		marine.doCommand();
		
		
	}

}
