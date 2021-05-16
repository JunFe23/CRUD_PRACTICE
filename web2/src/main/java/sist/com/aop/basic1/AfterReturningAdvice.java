package sist.com.aop.basic1;

public class AfterReturningAdvice {

	public void afterProcess() {
		System.out.println("AfterReturning Commit");
		System.out.println("AfterReturning Close");
	}
}
