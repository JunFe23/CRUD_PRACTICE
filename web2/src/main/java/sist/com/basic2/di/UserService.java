package sist.com.basic2.di;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component(value="us")
public class UserService   implements Service{	

	@Resource(name="myBatisDao")
	private Dao dao1;
	@Resource(name="jdbcDao")
	private Dao dao2;
	
	//private FactoryDao fdao;

	@Override
	public void finder() {
		// TODO Auto-generated method stub
		dao1.select();
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		dao2.select();
	}

	@Override
	public void fileCheck() {
		// TODO Auto-generated method stub
		
		
		
	}
	

}
