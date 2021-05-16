package sist.com.bean;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import sist.com.dao.BoardDao;

/*preHandle
postHandle
afterCompletion*/

public class InterCepterPro extends HandlerInterceptorAdapter{
	@Resource(name="boardDao")
	private BoardDao boardDao;
	private String id;
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("preHandle");
		id=request.getParameter("id");
		String pw=request.getParameter("pw");
		System.out.println(boardDao);
		if(!(boardDao.idMvcBoardCheck(id, pw))) {
			response.sendRedirect("springOption3/login.jsp");
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		request.getSession().setAttribute("id", id);
		request.getSession().setMaxInactiveInterval(60);
			
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	

}
