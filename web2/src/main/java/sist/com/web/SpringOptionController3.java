package sist.com.web;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SpringOptionController3 {
	
	@RequestMapping(value="cookitColor.do")//쿠키생성 
	public String cookieMakeColor(@RequestParam(value="color",
	                  required=false,defaultValue="white")String color,
			          HttpServletResponse response,Model model) {
		Cookie cookie=null;
		cookie=new Cookie("color", color);
		cookie.setMaxAge(60);
		response.addCookie(cookie);
		model.addAttribute("color", color);
		return "/springOption2/optionExResult";
		
	}
	@RequestMapping(value="cookieCheck.do")
	public String cookieCheckProcess(Model model,@CookieValue(value="color",required=false,defaultValue="white")String cook) {
		model.addAttribute("cook", cook);	
		return "springOption2/optionEx2Color";
	}
	@RequestMapping(value="loginCookieCheck.do")
	public String cookieProc(@CookieValue(value="id",required=false,defaultValue="empty")String cook,Model model) {
		model.addAttribute("id",cook);
		return "/springOption2/adminLogin";
	}
	
	@RequestMapping(value="cookieLogin.do")
	public String cookLoginMake(@RequestParam(value="id")String id,
			String checker,HttpServletResponse response) {	
		Cookie cookie=null;
		cookie=new Cookie("id", id);		
		cookie.setMaxAge(checker!=null?60:0);		
		response.addCookie(cookie);
		return "/springOption2/cookieMake";
	}
	
	@PostMapping(value="intercepterLogin.do")
	public String loginInterAction(String id,String pw) {		
		return "redirect:/intercepterList.do";		
	}
	@RequestMapping(value="intercepterList.do")
	public String intercepterListAction(Model model) {
		System.out.println("intercepterList");
		model.addAttribute("message", "IntercepterList");
		return "/springOption3/successList";
	}
	
	

}


















