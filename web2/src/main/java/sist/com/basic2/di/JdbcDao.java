package sist.com.basic2.di;

import org.springframework.stereotype.Component;

@Component
public class JdbcDao implements Dao{

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("JdbcDao select");
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
