package sist.com.basic1.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class StoreMain {
	
	public static void main(String[] args) {
		 ApplicationContext context=new FileSystemXmlApplicationContext("src/main/java/sist/com/basic1/di/store.xml");
		 
		 //System.out.println(context.getBean("book1"));
		 System.out.println(context.getBean("abc"));
	}

}
