package sist.com.web;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sist.com.bean.ReplyBean;
import sist.com.dao.BoardDao;

@RestController
public class AjaxCrudRestController {
	@Resource(name="boardDao")
	private BoardDao dao;
	
	@RequestMapping(value="ajaxList.do")//loading
	public   List<ReplyBean> ajaxCommentSelect(){
		return dao.selectAjaxList();
	}	
	@RequestMapping(value="ajaxInsert.do")//insert
	public   List<ReplyBean> ajaxCommentInsert(ReplyBean bean) throws UnsupportedEncodingException {
		//새글 답글 
		int no=dao.getAjaxReplySequence();
		bean.setNo(no);
		if(bean.getJob().equals("new")) {
			bean.setRef(no);
			bean.setPnum(no);			
		}
		dao.insertAjaxReply(bean);	
		
		return dao.selectAjaxList();
	}
	@PostMapping(value="ajaxDelete.do")
	public   List<ReplyBean> ajaxCommentDelete(int no) throws UnsupportedEncodingException {		 
		dao.deleteAjax(no);		
		return dao.selectAjaxList();
	}

}















