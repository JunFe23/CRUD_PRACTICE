package sist.com.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value="orangeDao")
public class OrangeBasicDao  extends SqlSessionDaoSupport{	
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// TODO Auto-generated method stub		
		super.setSqlSessionFactory(sqlSessionFactory);
		System.out.println(this.getSqlSession());
	}
	
	public List<HashMap<String, Object>>empListAction(){
		return this.getSqlSession().selectList("empListAction");
	}

	public List<Map<String, Object>>deptListAction(HashMap<String, Object>map){
		return this.getSqlSession().selectList("sist.com.bean.crud.deptListAction",map);
	}
	
}
