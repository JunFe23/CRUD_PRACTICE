package sist.com.aop.basic3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectProcess {
	
	/*@Before("execution(public * sist.com.aop.basic3.Search*.*(..) )")
	public void dataAttributeProcess(JoinPoint joinPoint ) {
		System.out.println("Before dataAttributeProcess");		
		Signature signature=joinPoint.getSignature();
		String methodName=signature.getName();
		switch (methodName) {
		case "fileSearch":
			System.out.println("Before FileSearch");
			break;
		case "domSax":
			System.out.println("Before DomSaxSearch");
			break;
		case "xmlParsing":
			System.out.println("Before XmlSearch");
			break;
		default:
			break;
		}		
	}
	@AfterThrowing ("execution(public * sist.com.aop.basic3.Search*.*(..) )")
	public void exceptionCheck(JoinPoint joinPoint) {
		System.out.println("exceptionCheck"+joinPoint.getSignature().getName());
		
	}
	@After("execution(public * sist.com.aop.basic3.Search*.*(..) )")
	public void fileAfterCheck(JoinPoint joinPoint) {
		System.out.println("After fileAfterCheck"+joinPoint.getSignature().getName());
		
	}
	@AfterReturning ("execution(public * sist.com.aop.basic3.Search*.*(..) )")
	public void fileAfterReturnCheck(JoinPoint joinPoint) {
		System.out.println("FileAfterReturnCheck"+joinPoint.getSignature().getName());
		
	}*/
	
	@Around("execution(public * sist.com.aop.basic3.Search*.*(..) )")
	public void aroundMethod(ProceedingJoinPoint jp) {
		try {
			System.out.println("aroundMethodBefore");	
			jp.proceed();//ÇÙ½ÉÄÚµå				
			System.out.println("aroundMethodAfter");	

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception Around");
			
		}

		
	}
	
	
	
	
	
	
}






