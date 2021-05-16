package sist.com.basic6.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sist.com.basic5.di.ConfigProcess;

public class FileMain {
	
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ConfigFile.class);
		
		((DispatcherAction)context.getBean("gbs")).actionDisProcess();
		((DispatcherAction)context.getBean("gdm")).actionDisProcess();
		
	}

}
