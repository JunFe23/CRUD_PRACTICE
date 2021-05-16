package sist.com.basic2.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.test.annotation.Commit;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;




@Component
public class DbmsProcess{
	@Value(value="${db1.url}")
	private String url;
	@Value(value="${db1.account}")
	private String account;
	@Value(value="${db1.password}")
	private String password;
	@Override
	public String toString() {
		return "DmbsProcess [url=" + url + ", account=" + account + ", password=" + password + "]";
	}	
	public String getConnect() {
		return url+"Connect"+" "+account+" "+password;
	}
	

}
