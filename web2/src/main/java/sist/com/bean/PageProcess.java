package sist.com.bean;

import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import lombok.Data;
import sist.com.dao.BoardDao;
@Component
@Data
public class PageProcess {
	@Resource(name="boardDao")
	private BoardDao boardDao;
	
	private PageBean pageBean; 
	private StringBuffer stringBuffer=new StringBuffer();
	
	public  HashMap<String,Object> paging(HttpServletRequest request){		 
		   HashMap<String,Object>map=new HashMap<String,Object>();		 
		   int pageScale=2;
		   int currentPage=1;
		   int totalRow=boardDao.getRowCount();
		   int totalPage=totalRow%pageScale==0?totalRow/pageScale:(totalRow/pageScale)+1;
		   if(totalRow==0)totalPage=1;
		   String tempPage=null;
		   try{
			   tempPage=request.getParameter("page");
			   currentPage=Integer.parseInt(tempPage);
		   }catch(Exception e){	   
			   
		   }
		   int start=1+(currentPage-1)*pageScale;   
		   int end=pageScale+(currentPage-1)*pageScale;
		   int currentBlock=currentPage%pageScale==0?currentPage/pageScale:(currentPage/pageScale)+1;
		   int startPage=1+(currentBlock-1)*pageScale;
		   int endPage=pageScale+(currentBlock-1)*pageScale;		   
		   if(totalPage<=endPage){
			   endPage=totalPage;
		   }
		  
		   map.put("start", start);
		   map.put("end", end);
		   pageBean=new PageBean(currentPage, startPage, endPage, totalPage, currentBlock);
		  return map; 
	}
	public void makePage() {
		stringBuffer.delete(0, stringBuffer.length());
		 stringBuffer.append("<div class=\"col-md-8\">");
				   stringBuffer.append("<ul class=\"pagination\">");
				   if(pageBean.getCurrentBlock()>1) {
					   stringBuffer.append("<li><a href=/web/mvcList.do?page="+(pageBean.getStartPage()-1)+">이전</a></li>");
				   }else {
					   stringBuffer.append("<li><a href=\"#\">이전</a></li>");				   }
				   
				   
				   for (int i = pageBean.getStartPage(); i <= pageBean.getEndPage(); i++) {
					   if(i==pageBean.getCurrentPage()) {
						   stringBuffer.append("<li><a href=#><font color=red>"+i+"</font></a></li>");
					   }else
					   stringBuffer.append("<li><a href=mvcList.do?page="+i+">"+i+"</a></li>");	
					   
				   }	
				   if(pageBean.getTotalPage()>pageBean.getEndPage()) {
					   stringBuffer.append("<li><a href=/web/mvcList.do?page="+(pageBean.getEndPage()+1)+">다음</a></li>");   
				   }else {
					   stringBuffer.append("<li><a href=#>다음</a></li>");
				   }				   
				   stringBuffer.append("</ul>");
		stringBuffer.append("</div>");
		
		
	}
	
	

}






