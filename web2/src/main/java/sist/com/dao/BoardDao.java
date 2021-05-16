package sist.com.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sist.com.bean.MvcBoardBean;
import sist.com.bean.ReplyBean;

@Repository(value="boardDao")
public class BoardDao  extends SqlSessionDaoSupport{
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// TODO Auto-generated method stub		
		super.setSqlSessionFactory(sqlSessionFactory);
		System.out.println(this.getSqlSession());
	}
    public boolean selectGetId(String id) {
    	return this.getSqlSession().selectOne("selectGetId",id)!=null;
    }
    public int getRowCount() {
    	return this.getSqlSession().selectOne("getRowCount");
    }
	
	public boolean idMvcBoardCheck(String id,String password) {
		 String dbPass= this.getSqlSession().selectOne("idMvcBoardCheck",id);
		 return dbPass!=null&&dbPass.equals(password);
	}
	public void insertBoardMvc(MvcBoardBean bean) {
		this.getSqlSession().insert("insertBoardMvc",bean);		
	}
	public List<MvcBoardBean>selectMvcBoard(HashMap<String, Object>map){
		return this.getSqlSession().selectList("selectMvcBoard",map);
	}
	public MvcBoardBean selectInfoBoard(Map<String,?>map) {
		return this.getSqlSession().selectOne("selectInfoBoard", map);
	}
	public void updateHitBoard(int no) {
		this.getSqlSession().update("updateHitBoard",no);
	}
	public String idChekValue(String id) {
		return this.getSqlSession().selectOne("idChekValue", id);
	}
	public void insertidChekValue(HashMap<String, Object>map) {
		this.getSqlSession().insert("insertidChekValue", map);
	}
	public void updateidChekValue(HashMap<String, Object>map) {
		this.getSqlSession().update("updateidChekValue", map);
	}
	public Integer getAjaxReplySequence() {
		return this.getSqlSession().selectOne("getAjaxReplySequence");
	}
	public void insertAjaxReply(ReplyBean bean) {
		this.getSqlSession().insert("insertAjaxReply",bean);
	}
	public List<ReplyBean>selectAjaxList(){
		return this.getSqlSession().selectList("selectAjaxList");
	}
	public void deleteAjax(int no) {
		this.getSqlSession().delete("deleteAjax", no);
	}
	
}
















