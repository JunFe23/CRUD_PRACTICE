package sist.com.basic4.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NodeMain {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ConfigDemo.class);
		System.out.println(context.getBean("orange"));
		System.out.println(context.getBean("person1"));
		System.out.println(context.getBean("action"));
				
		System.out.println(context.getBean("myBatisDao"));
		
		
	}

}
