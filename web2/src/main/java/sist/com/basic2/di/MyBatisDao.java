package sist.com.basic2.di;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class MyBatisDao implements Dao{
	
	@Inject
	private SqlMySessionFactory sessionFactory;
	public void select() {
		sessionFactory.connect();
		System.out.println("MyBatisDao select");		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		sessionFactory.connect();
		System.out.println("myBatisDao Update");
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	
	

}
