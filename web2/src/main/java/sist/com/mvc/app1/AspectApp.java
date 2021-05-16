package sist.com.mvc.app1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/*@Aspect
@Component*/
public class AspectApp {
	
	//@Before("execution(public * sist.com.mvc.app1.DaoApp*.*(..) )")
	public void fileBefore() {
		System.out.println("fileBeforeApp");
	}

}
