package sist.com.aop.basic3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdminSearchImp extends Object implements Search{
	
	@Autowired
	private FileProcess file;	
	@Override
	public void fileSearch() {
		// TODO Auto-generated method stub
		System.out.println("AdminFileSearch...");
		//int rs=10/0;
		file.fileProperties();
		
		
	}

	@Override
	public void xmlParsing() {
		// TODO Auto-generated method stub
		System.out.println("AdminxmlParsing...");
		file.fileValidate();
		
	}

	@Override
	public void domSax() {
		// TODO Auto-generated method stub
		System.out.println("AdmindomSax...");
		file.fileValidate();
	}
	

}
