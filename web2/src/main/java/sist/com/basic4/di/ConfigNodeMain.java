package sist.com.basic4.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigNodeMain {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ConfigNode.class);
		System.out.println(context.getBean("parentElement"));
	}

}
