package sist.com.basic5.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sist.com.basic4.di.ConfigNode;

public class ProcMain {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ConfigProcess.class);
		/*ValidateAction v=(ValidateAction)context.getBean("validateAction");
		v.setFilename("d:\\hi.jpg");
		System.out.println(v.getFilename());
		System.out.println(v);*/
		
		//System.out.println(context.getBean("getValidateAction"));
		System.out.println(context.getBean("pcl"));
		//System.out.println(context.getBean("pcl"));
	}

}
