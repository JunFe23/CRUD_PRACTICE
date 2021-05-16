package sist.com.basic6.di;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*@Component*/
public class BlogService implements Service {
	//@Resource(name="filebs2")
	@Inject
	@Qualifier(value="f1")
	private FileSource2 filesource;
	@Override
	public void fileCheck() {
		// TODO Auto-generated method stub
		System.out.println(filesource.getInfo());
		System.out.println("BlogService fileCheck");
		filesource.fileIncrement();
	}

	@Override
	public void fileValidate() {
		// TODO Auto-generated method stub
		System.out.println("BlogServicefileValidate");
	}
  
}
