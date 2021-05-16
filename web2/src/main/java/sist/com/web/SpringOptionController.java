package sist.com.web;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import sist.com.bean.ReplyBean;
import sist.com.bean.UserException;

@Controller
public class SpringOptionController {
	
	
	@RequestMapping(value="nullEx.do")
	public String locationFun1(@RequestParam(value="job",required=false,defaultValue="success")String job) {
		ReplyBean bean=null;
		if(job!=null&& job.equals("success"))bean=new ReplyBean();
		bean.setContents("HiMessage");
		return "springOption/optionEx1View";
	}
	@RequestMapping(value="numberformat.do")
	public String locationFun2(@RequestParam(value="job",required=false,defaultValue="success")String job) {
		
		if(!(job!=null&& job.equals("success")))		
		 {
			String temp="1이3";
			Integer.parseInt(temp);		
		}
		return "springOption/optionEx1View";	
	}
	@RequestMapping(value="classCast.do")
	public String locationFun3(@RequestParam(value="job",required=false,defaultValue="success")String job) {
		  String obj=null;
		if(!(job!=null&& job.equals("success")))//fail		
		{
			obj=(String)new Object();
			obj.charAt(0);
		}
		return "springOption/optionEx1View";	
	}
	@RequestMapping(value="userEx.do")
	public String locationFun4(@RequestParam(value="job",required=false,defaultValue="success")String job) {
		
		if(!(job!=null&& job.equals("success")))//fail		
		{
		    throw new UserException();
		}
		/*String s=null;
		s.charAt(0);*/
		return "springOption/optionEx1View";	
	}
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "UserExceptionTestMessage")
	//@ExceptionHandler(UserException.class)	
	public String exceptionClassCast(Exception e,Model model) {
		model.addAttribute("exception", e);
		return "/springOption/exceptionView1";
	}
	
	@ExceptionHandler(Exception.class)
	public String exception(Exception e,Model model) {
		model.addAttribute("exception", e);
		return "/springOption/exceptionView1";
	}	
	
	/*@ExceptionHandler(ClassCastException.class)
	public String exceptionClassCast(ClassCastException e,Model model) {
		model.addAttribute("exception", e);
		return "/springOption/exceptionView1";
	}
	
	
	@ExceptionHandler(NumberFormatException.class)
	public String exceptionNumber(NumberFormatException e,Model model) {
		model.addAttribute("exception", e);
		return "/springOption/exceptionView1";
	}
	
	@ExceptionHandler(NullPointerException.class)
	public ModelAndView exceptionNull(NullPointerException e) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/springOption/exceptionView1");
		mv.addObject("exception", e);
		return mv;
	}*/

}





