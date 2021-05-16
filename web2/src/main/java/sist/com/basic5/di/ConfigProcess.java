package sist.com.basic5.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"sist.com.basic5.di"})
public class ConfigProcess {
	
	/*private String filename;
	private int fileSize;
	private int connect;
	private double fileCount;*/
	
	@Bean(name="v1")	
	public ValidateAction getValidateAction1() {
		ValidateAction v=new ValidateAction("d:\\img.jpg",100,50,10.9);
		//v=new ValidateAction();	
		//v=new ValidateAction("d:\\img.jpg", 200);
		return v;
	}
	/*@Bean	
	public ValidateAction getValidateAction2() {
		ValidateAction v=new ValidateAction();
		v.setFilename("d:\\aa.txt");
		v.setFileSize(500);	
		
		return v;
	}*/

}


