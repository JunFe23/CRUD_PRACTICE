package sist.com.basic2.di;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class AdminService implements Service{
	@Resource(name="myBatisDao")
	private Dao dao;
		
	
	public Dao getDao() {
		return dao;
	}	
	/*@Required
	@Resource(name="jpa")
	public void setDao(Dao dao) {
		this.dao = dao;
	}*/
	public AdminService() {
		// TODO Auto-generated constructor stub
	}	
	public AdminService(Dao dao) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void finder() {
		// TODO Auto-generated method stub
		dao.select();
		
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fileCheck() {
		// TODO Auto-generated method stub
		
	}
	
	

}
