package sist.com.basic2.di;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="singleton")
public class Jpa implements Dao{

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("Jpa select");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	

}
