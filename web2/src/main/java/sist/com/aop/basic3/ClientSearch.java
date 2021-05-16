package sist.com.aop.basic3;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class ClientSearch implements Search{
	@Inject
	private FileProcess file;

	@Override
	public void fileSearch() {
		// TODO Auto-generated method stub
		System.out.println("ClientFileSearch...");
		file.fileProperties();
		
	}

	@Override
	public void xmlParsing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void domSax() {
		// TODO Auto-generated method stub
		
	}
	


}
