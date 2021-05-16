package sist.com.basic2.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SqlMySessionFactory {
	
	@Autowired
	private DbmsProcess dbmsProcess;
	
	public void connect() {
		System.out.println(dbmsProcess.getConnect());
	}
	
	
}
