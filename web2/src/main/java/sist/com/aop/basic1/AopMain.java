package sist.com.aop.basic1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AopMain {
	
	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("src/main/java/sist/com/aop/basic1/dao.xml");
		ParentDao dao=(ParentDao)context.getBean("mydao");
		dao.select();
		dao.insert("");
		
	}

}
