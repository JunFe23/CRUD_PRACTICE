package sist.com.basic5.diprc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("sist.com.basic5.diprc")
public class ConfigProcess {
	
	@Bean(value="v1")
	private PracticeAction getPracticeAction() {
		PracticeAction p=new PracticeAction();
		p.setName("JUNFE");
		p.setAge(29);
		p.setJob("Developer");
		
		return p;
	}
}
