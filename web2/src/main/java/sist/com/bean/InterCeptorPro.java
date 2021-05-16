package sist.com.bean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class InterCeptorPro extends HandlerInterceptorAdapter {

	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	         throws Exception {
	      String id=request.getParameter("id");
	      String pw=request.getParameter("pw");
	      if(!(id.equals("Admin")&&pw.equals("1234"))) {
	         response.sendRedirect("/web/springOption3/login.jsp");
	         return false;
	      }
	      System.out.println("preHandle");
	      return true;//true 다오로 id,pw확인> 로그인 성공하면>이동 , false 로그인 실패하면
	   }

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("postHandle");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterCompletion");
	}

	
	
}
