package sist.com.aop.basic1;

public class AfterAdvice {	
	public void afterCheckFun() {
		System.out.println("File Size Check After");
		System.out.println("After Commit");
		System.out.println("After Close!");
	}

}
