package sist.com.basic2.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DaoMain {
	
	public static void main(String[] args) {
		 ApplicationContext context=new FileSystemXmlApplicationContext("/src/main/java/sist/com/basic2/di/dao.xml");
		 
		 Service service=(Service)context.getBean("adminService") ;
		 service.finder();
		 //service.validate();
		 
		
		 
	}

}
