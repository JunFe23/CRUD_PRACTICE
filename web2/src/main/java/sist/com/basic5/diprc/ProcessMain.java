package sist.com.basic5.diprc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sist.com.basic5.di.ConfigProcess;

public class ProcessMain {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigProcess.class);
		System.out.println(context.getBean("junfe"));
	}
	
	
}
