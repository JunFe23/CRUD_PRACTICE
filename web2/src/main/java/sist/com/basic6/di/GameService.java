package sist.com.basic6.di;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*@Component*/
public class GameService implements Service {	
	//@Resource(name="filebs3")
	@Autowired
	@Qualifier(value="f3")
	private FileSource2 filesource;
	@Override
	public void fileCheck() {
		// TODO Auto-generated method stub
		System.out.println( filesource.getInfo());
		System.out.println("GameService fileCheck");
		filesource.fileIncrement();
	}

	@Override
	public void fileValidate() {
		// TODO Auto-generated method stub
		System.out.println("GameService fileValidate");
		System.out.println(filesource.getInfo());
	}
	
	

}
